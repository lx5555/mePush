package com.lx.mePush.stream;

import com.lx.mePush.common.domain.AnchorInfo;
import com.lx.mePush.austin.stream.constants.AustinFlinkConstant;
import com.lx.mePush.austin.stream.function.AustinFlatMapFunction;
import com.lx.mePush.austin.stream.sink.AustinSink;
import com.lx.mePush.austin.stream.utils.MessageQueueUtils;
import lombok.extern.slf4j.Slf4j;
import org.apache.flink.api.common.eventtime.WatermarkStrategy;
import org.apache.flink.connector.kafka.source.KafkaSource;
import org.apache.flink.streaming.api.datastream.DataStreamSource;
import org.apache.flink.streaming.api.datastream.SingleOutputStreamOperator;
import org.apache.flink.streaming.api.environment.StreamExecutionEnvironment;

/**
 * flink启动类
 *
 * @author lx
 */
@Slf4j
public class mePushBootStrap {

    public static void main(String[] args) throws Exception {
        StreamExecutionEnvironment env = StreamExecutionEnvironment.getExecutionEnvironment();

        /**
         * 1.获取KafkaConsumer
         */
        KafkaSource<String> kafkaConsumer = MessageQueueUtils.getKafkaConsumer(AustinFlinkConstant.TOPIC_NAME, AustinFlinkConstant.GROUP_ID, AustinFlinkConstant.BROKER);
        DataStreamSource<String> kafkaSource = env.fromSource(kafkaConsumer, WatermarkStrategy.noWatermarks(), AustinFlinkConstant.SOURCE_NAME);


        /**
         * 2. 数据转换处理，状态<消息下发失败/成功>
         */
        SingleOutputStreamOperator<AnchorInfo> dataStream = kafkaSource.flatMap(new AustinFlatMapFunction()).name(AustinFlinkConstant.FUNCTION_NAME);

        /**
         * 3. 数据转换处理，状态<失败原因，从而分析业务处理参数是否存在问题>
         */
        SingleOutputStreamOperator<AnchorInfo> dataStream_fail = kafkaSource.flatMap(new AustinFlatMapFunction()).name(AustinFlinkConstant.FUNCTION_NAME);

        /**
         * 4. 将实时数据多维度写入Redis(已实现)，离线数据写入hive(未实现)
         */
        dataStream.addSink(new AustinSink()).name(AustinFlinkConstant.SINK_NAME);
        dataStream_fail.addSink(new AustinSink()).name(AustinFlinkConstant.SINK_NAME);
        env.execute(AustinFlinkConstant.JOB_NAME);

    }

}
