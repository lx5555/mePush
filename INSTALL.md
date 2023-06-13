## 01、安装MYSQL

**一**、下载并安装mysql：

```
wget -i -c http://dev.mysql.com/get/mysql57-community-release-el7-10.noarch.rpm
yum -y install mysql57-community-release-el7-10.noarch.rpm
yum -y install mysql-community-server --nogpgcheck
```

**二**、启动并查看状态MySQL：

```
systemctl start  mysqld.service
systemctl status mysqld.service
```

**三**、查看MySQL的默认密码：

```
grep "password" /var/log/mysqld.log
```

[![img](https://p3-juejin.byteimg.com/tos-cn-i-k3u1fbpfcp/98b36a9b01de4cc79f3a53245296a19c~tplv-k3u1fbpfcp-zoom-1.image)](https://tva1.sinaimg.cn/large/008i3skNgy1gwg6eiwyqfj313402mgm8.jpg)

**四**、登录进MySQL

```
mysql -uroot -p
```

**五**、修改默认密码（设置密码需要有大小写符号组合—安全性)，把下面的`my password`替换成自己的密码

```
ALTER USER 'root'@'localhost' IDENTIFIED BY 'my password';
```

**六**、开启远程访问 (把下面的`my password`替换成自己的密码)

```
grant all privileges on *.* to 'root'@'%' identified by 'my password' with grant option;

flush privileges;

exit
```

**七**、在云服务上增加MySQL的端口

## 02、安装DOCKER和DOCKER-COMPOSE

首先我们需要安装GCC相关的环境：

```
yum -y install gcc

yum -y install gcc-c++
```

安装Docker需要的依赖软件包：

```
yum install -y yum-utils device-mapper-persistent-data lvm2
```

设置国内的镜像（提高速度）

```
yum-config-manager --add-repo http://mirrors.aliyun.com/docker-ce/linux/centos/docker-ce.repo
```

更新yum软件包索引：

```
yum makecache fast
```

安装DOCKER CE(注意：Docker分为CE版和EE版，一般我们用CE版就够用了.)

```
yum -y install docker-ce
```

启动Docker：

```
systemctl start docker
```

下载回来的Docker版本：:

```
docker version
```

运行以下命令以下载 Docker Compose 的当前稳定版本：

```
sudo curl -L "https://github.com/docker/compose/releases/download/1.24.1/docker-compose-$(uname -s)-$(uname -m)" -o /usr/local/bin/docker-compose

#慢的话可以用这个
sudo curl -L https://get.daocloud.io/docker/compose/releases/download/1.25.1/docker-compose-`uname -s`-`uname -m` -o /usr/local/bin/docker-compose

```

将可执行权限应用于二进制文件：

```
sudo chmod +x /usr/local/bin/docker-compose
```

创建软链：

```
sudo ln -s /usr/local/bin/docker-compose /usr/bin/docker-compose
```

测试是否安装成功：

```
docker-compose --version
```
