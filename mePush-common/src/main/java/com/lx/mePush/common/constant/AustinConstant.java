package com.lx.mePush.common.constant;


/**
 * Austin常量信息
 *
 * @author lx
 */
public class AustinConstant {

    /**
     * businessId默认的长度
     * 生成的逻辑：com.lx.mePush.support.utils.TaskInfoUtils#generateBusinessId(java.lang.Long, java.lang.Integer)
     */
    public final static Integer BUSINESS_ID_LENGTH = 16;

    /**
     * 接口限制 最多的人数
     */
    public static final Integer BATCH_RECEIVER_SIZE = 100;

    /**
     * 消息发送给全部人的标识
     * (企业微信 应用消息)
     * (钉钉自定义机器人)
     * (钉钉工作消息)
     */
    public static final String SEND_ALL = "@all";


    /**
     * 默认的常量，如果新建模板/账号时，没传入则用该常量
     */
    public static final String DEFAULT_CREATOR = "lx";
    public static final String DEFAULT_UPDATOR = "lx";
    public static final String DEFAULT_TEAM = "lx";
    public static final String DEFAULT_AUDITOR = "lx";


}
