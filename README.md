                                                  消息推送平台-mePush
                                      
<p align="center">
  <a href="#项目文档"><img src="https://img.shields.io/badge/SpringBoot-2.5.6-green.svg" alt="SpringBoot版本"></a>
  <a href="#项目文档"><img src="https://img.shields.io/badge/MySQL-5.7.x-green.svg" alt="MySQL版本"></a>
  <a href="#项目文档"><img src="https://img.shields.io/badge/maven-3.6.x-green.svg" alt="maven版本"></a>
  <a href="#项目文档"><img src="https://img.shields.io/badge/ORM-MyBatis-green.svg" alt="ORM框架"></a>
  <a href="#项目文档"><img src="https://img.shields.io/badge/Cache-Redis-orange.svg" alt="ORM框架"></a>
  <a href="#项目文档"><img src="https://img.shields.io/badge/日志采集-Graylog-orange.svg" alt="分布式日志采集"></a>
  <a href="#项目文档"><img src="https://img.shields.io/badge/定时任务-xxljob-orange.svg" alt="分布式定时任务"></a>
  <a href="#项目文档"><img src="https://img.shields.io/badge/动态线程池-DynamicTp-orange.svg" alt="动态线程池"></a>
  <a href="#项目文档"><img src="https://img.shields.io/badge/配置中心-Apollo-red.svg" alt="分布式配置中心"></a>
  <a href="#项目文档"><img src="https://img.shields.io/badge/消息队列-Kafka-red.svg" alt="分布式消息队列"></a>
  <a href="#项目文档"><img src="https://img.shields.io/badge/分布式计算引擎-Flink-red.svg" alt="计算引擎"></a>
</p>

##项目演示地址：http://8.130.126.21:3000/

## 项目结构
- mePush-common：公共方法
- mePush-cron：定时任务执行器
- mePush-handler：MQ消费者，业务处理
- mePush-service-api-impl：接入层实现类
- mePush-service-api：接入层
- com.tank.stream：数据清洗
- com.tank.support：MQ提供者，业务处理
- com.tank.web：SpringMVC
- com.tank.xxljob-master：定时任务调度器



## 背景（业务范围）
只要有发送消息的需求，就可以使用本项目，具体场景如下：

  **1.广告商投放广告**
  **2.验证码短信下发**
  **3.通知类，警告类信息下发，例如某用户关注的主播开播了，系统警告线程池线程数达到阈值**

![image](https://github.com/lx5555/mePush/assets/71442208/0d3917b3-362e-4ede-b389-7707ff583634)



## 核心功能：
1.不同渠道不同类型的消息发送
2.消息的全链路生命周期追踪

![image](https://github.com/lx5555/mePush/assets/71442208/53258233-432d-40be-8772-6d763df74b53)


## 如何使用：

创建账号（选择渠道！！！接入姿势查看对应官方文档1.qq邮箱开启POP3/IMAP/SMTP/Exchange/CardDAV/CalDAV服务即可 2.短信去对应渠道官网开通服务：https://console.cloud.tencent.com/smsv2 3.企业微信：https://developer.work.weixin.qq.com/document/path/91201）：

![image](https://github.com/lx5555/mePush/assets/71442208/636e0f00-ddc3-4bdc-b0e9-1b67a4156b87)

创建模板（选择刚才创建的账号作为发送账号）：

![image](https://github.com/lx5555/mePush/assets/71442208/26559425-84d6-4e14-81db-8ff2b66c5a9d)

填写发送账号，标题和文案

![image](https://github.com/lx5555/mePush/assets/71442208/37587c61-6ab6-46b4-aa64-298649302649)

## 如何部署
**项目配置文件在mePush-web下面的application.properties，你只需要安装对应软件，更改配置文件即可启动**
**启动mePush-web即可**

**Level1：发送消息功能**
你需要部署MySql5.7.x + Redis + Kafka
参考：https://blog.csdn.net/weixin_42207486/article/details/80647802

**Level2：消息全链路追踪**
你需要部署Flink，并且提交stream代码
参考：https://blog.csdn.net/momo898821/article/details/105579464

**Level3：定时任务，动态线程池。。。**
你需要部署xxl-job 以及 Apollo
参考：https://www.jianshu.com/p/09ad73aece33

## 设计思路（欢迎补充）：

1.消息隔离

![image](https://github.com/lx5555/mePush/assets/71442208/5799a96d-29bb-49cc-9d45-1249479b83e2)

2.全链路追踪

两种角度：用户角度（给用户反馈为什么消息发送失败） + 模板角度（广告曝光量）

3.消息发送可靠性
限流，黑名单，渠道负载，消息重试，消息丢失等

