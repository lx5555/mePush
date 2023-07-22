                                      消息推送平台-mePush
                                      
<p align="center">
  <a href="#"><img src="https://img.shields.io/badge/Author-3y-orange.svg" alt="作者"></a>
  <a href="#项目官方交流群"><img src="https://img.shields.io/badge/项目群-交流-red.svg" alt="项目群交流"></a>
  <a href="https://space.bilibili.com/198434865/channel/collectiondetail?sid=435119"><img src="https://img.shields.io/badge/免费项目-视频-green.svg" alt="Bilibili"></a>
  <a href="https://gitee.com/zhongfucheng/austin"><img src="https://gitee.com/zhongfucheng/austin/badge/star.svg?theme=dark" alt="Gitee Starts"></a>
  <a href="https://gitee.com/zhongfucheng/austin"><img src="https://gitee.com/zhongfucheng/austin/badge/fork.svg?theme=dark" alt="Gitee Starts"></a>
  <a href="https://github.com/ZhongFuCheng3y/austin"><img src="https://img.shields.io/github/forks/ZhongFuCheng3y/austin.svg?style=flat&label=GithubFork"></a> 
  <a href="https://github.com/ZhongFuCheng3y/austin"><img src="https://img.shields.io/github/stars/ZhongFuCheng3y/austin.svg?style=flat&label=GithubStars"></a>
  <a href="#项目文档"><img src="https://img.shields.io/github/issues/ZhongFuCheng3y/austin" alt="issue-open"></a>
  <a href="#项目文档"><img src="https://img.shields.io/github/issues-closed/ZhongFuCheng3y/austin" alt="issue-close"></a>
  <a href="#项目文档"><img src="https://img.shields.io/github/issues-pr/ZhongFuCheng3y/austin" alt="issue-close"></a>
  <a href="#项目文档"><img src="https://img.shields.io/github/issues-pr-closed/ZhongFuCheng3y/austin" alt="issue-close"></a>
  <a href="#项目文档"><img src="https://img.shields.io/github/license/ZhongFuCheng3y/austin" alt="issue-close"></a>
  <a href="#项目文档"><img src="https://img.shields.io/badge/JDK-8-red.svg" alt="jdk版本"></a>
  <a href="#项目文档"><img src="https://img.shields.io/badge/SpringBoot-2.5.6-green.svg" alt="SpringBoot版本"></a>
  <a href="#项目文档"><img src="https://img.shields.io/badge/Centos-7.6-blue.svg" alt="Centos版本"></a>
  <a href="#项目文档"><img src="https://img.shields.io/badge/MySQL-5.7.x-orange.svg" alt="MySQL版本"></a>
  <a href="#项目文档"><img src="https://img.shields.io/badge/maven-3.6.x-red.svg" alt="maven版本"></a>
  <a href="#项目文档"><img src="https://img.shields.io/badge/ORM-SpringData JPA-blue.svg" alt="ORM框架"></a>
  <a href="#项目文档"><img src="https://img.shields.io/badge/Cache-Redis-orange.svg" alt="ORM框架"></a>
  <a href="#项目文档"><img src="https://img.shields.io/badge/分布式定时任务-xxljob-green.svg" alt="分布式定时任务"></a>
  <a href="#项目文档"><img src="https://img.shields.io/badge/分布式配置中心-Apollo & Nacos-blue.svg" alt="分布式配置中心"></a>
  <a href="#项目文档"><img src="https://img.shields.io/badge/分布式消息队列-Kafka & RabbmitMQ & RocketMQ-red.svg" alt="分布式消息队列"></a>
  <a href="#项目文档"><img src="https://img.shields.io/badge/分布式日志采集-Graylog-orange.svg" alt="分布式日志采集"></a>
  <a href="#项目文档"><img src="https://img.shields.io/badge/分布式计算引擎-Flink-red.svg" alt="计算引擎"></a>
  <a href="#项目文档"><img src="https://img.shields.io/badge/监控组件-Promethus-blue.svg" alt="系统监控"></a>
  <a href="#项目文档"><img src="https://img.shields.io/badge/监控可视化-Grafana-green.svg" alt="系统监控"></a>
  <a href="#项目文档"><img src="https://img.shields.io/badge/系统部署-Docker & DockerCompose-yellow.svg" alt="部署"></a>
  <a href="#项目文档"><img src="https://img.shields.io/badge/大数据环境-Hadoop-red.svg" alt="部署"></a>
  <a href="#项目文档"><img src="https://img.shields.io/badge/数据仓库-Hive-orange.svg" alt="部署"></a>
  <a href="#项目文档"><img src="https://img.shields.io/badge/大数据可视化-Metabase-green.svg" alt="部署"></a>
  <a href="#项目文档"><img src="https://img.shields.io/badge/前端页面-amis-red.svg" alt="前端"></a>
</p>

##项目演示地址：http://8.130.126.21:3000/

##项目结构：
├── blog                           # 博客
├── docs                           # 文档/笔记
├── data                           # 项目/导航               # 资源导航
├── i18n                           # 国际化
├── src
│   ├── components                 # 组件
│   ├── css                        # 自定义CSS
│   ├── pages                      # 自定义页面
│   ├── plugin                     # 自定义插件
│   └── theme                      # 自定义主题组件
├── static                         # 静态资源文件
│   └── img                        # 静态图片
├── docusaurus.config.js           # 站点的配置信息
├── sidebars.js                    # 文档的侧边栏
├── package.json
├── tsconfig.json
└── yarn.lock


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


