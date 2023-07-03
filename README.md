                                      消息推送平台-mePush
                                      
项目演示地址：http://8.130.126.21:3000/


## 消息推送平台mePush介绍


**背景(只要有消息发送需求就可以用这个平台)：**

    1.广告商投放广告
    2.验证码短信下发
    3.通知类，警告类信息下发，例如某用户关注的主播开播了，系统警告线程池线程数达到阈值

![image](https://github.com/lx5555/mePush/assets/71442208/0d3917b3-362e-4ede-b389-7707ff583634)


**技术栈：** Springboot, MyBatis, Apollo, Kafka, Redis, DynamicTp, Flink, GrayLog, xxl-job


**核心功能：** 不同渠道不同类型的消息发送，消息的全链路生命周期追踪

![image](https://github.com/lx5555/mePush/assets/71442208/53258233-432d-40be-8772-6d763df74b53)


**如何使用：**

创建账号（选择渠道！！！接入姿势查看对应官方文档1.qq邮箱开启POP3/IMAP/SMTP/Exchange/CardDAV/CalDAV服务即可 2.短信去对应渠道官网开通服务：https://console.cloud.tencent.com/smsv2 3.企业微信：https://developer.work.weixin.qq.com/document/path/91201）：

![image](https://github.com/lx5555/mePush/assets/71442208/636e0f00-ddc3-4bdc-b0e9-1b67a4156b87)

创建模板（选择刚才创建的账号作为发送账号）：

![image](https://github.com/lx5555/mePush/assets/71442208/26559425-84d6-4e14-81db-8ff2b66c5a9d)

填写发送账号，标题和文案

![image](https://github.com/lx5555/mePush/assets/71442208/37587c61-6ab6-46b4-aa64-298649302649)



**设计思路（待补充）：**

1.消息隔离

![image](https://github.com/lx5555/mePush/assets/71442208/5799a96d-29bb-49cc-9d45-1249479b83e2)

2.全链路追踪

两种角度：用户角度（给用户反馈为什么消息发送失败） + 模板角度（广告曝光量）

3.补偿机制


