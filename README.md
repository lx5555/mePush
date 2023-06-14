                             消息推送平台-mePush
项目演示地址：http://8.130.126.21:3000/

消息推送平台mePush介绍

背景(只要有消息发送需求就可以用这个平台) :
    1.广告商投放广告
    2.验证码短信下发
    3.通知类，警告类信息下发，例如某用户关注的主播开播了，系统警告线程池线程数达到阈值

![image](https://github.com/lx5555/mePush/assets/71442208/0d3917b3-362e-4ede-b389-7707ff583634)

技术栈：Springboot, MyBatis, Apollo, Kafka, Redis, DynamicTp, Flink, GrayLog, xxl-job

核心功能：
     不同渠道不同类型的消息发送，消息的全链路生命周期追踪

![image](https://github.com/lx5555/mePush/assets/71442208/21034985-f7c0-4a76-ad47-ee2a8db09a72)


技术细节（待补充）：

1.handle层架构图

![image](https://github.com/lx5555/mePush/assets/71442208/5799a96d-29bb-49cc-9d45-1249479b83e2)

2.全链路追踪

两种角度：用户角度（给用户反馈为什么消息发送失败） + 模板角度（广告曝光量）

3.DynamicTp，规则引擎

结合Apollo配置中心，简化开发和维护

后记：
  引入中间件的目的是解决特定问题，但随之而来的是各种问题。。。
  1.MQ：消息幂等，消息丢失，消息顺序，消息积压等
  2.Redis：缓存击穿，缓存雪崩，缓存穿透，缓存mysql双写一致性问题等
  3....
