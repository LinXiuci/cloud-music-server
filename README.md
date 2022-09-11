# cloud-music-client
云音乐客户端

## 说明

  《云音乐》项目于2022年5月18号完成（还是有一点的小bug），大概耗时两三月余。此项目的客户端与后台管理都是采用 <a href="https://staging-cn.vuejs.org/">Vue3</a> 框架来实现，服务端则采用 Java + Spring Boot@2.6 + Mybatis 来实现，数据库是使用了 MySQL。
  
  注：
     1. 后端的技术语言都是边学边写的（主要是看别人写的技术博客），<a href="https://www.javaboy.org/springboot/">博客链接</a>。
     2. 目前已经采用 React Hook 框架开发该项目。
  
## 技术栈

1. 客户端与后台管理

TypeScript + Vue3 + Vue-Router + Vuex + Axios + ElementPlus + Echarts

2. 服务端

Java + Spring Boot@2.6 + MyBatis + MySQL+图形化界面 Navicat

## 各端地址

1. 云音乐客户端: https://github.com/LinXiuci/cloud-music-client

2. 云音乐管理后台: https://github.com/LinXiuci/cloud-music-manage

3. 云音乐服务端: https://github.com/LinXiuci/cloud-music-server


## 开发环境

1. JDK： jdk11
2. mysql：mysql-8.0.27-winx64
3. node：v16.13.2
4. IDE：IntelliJ IDEA 2018、VSCode

## 图片展示


### 客户端：
![](https://cdn.jsdelivr.net/gh/LinXiuci/image/img/m2.png)<br/>

![](https://cdn.jsdelivr.net/gh/LinXiuci/image/img/m1.png)<br/>

![](https://cdn.jsdelivr.net/gh/LinXiuci/image/img/m5.png)<br/>

![](https://cdn.jsdelivr.net/gh/LinXiuci/image/img/m3.png)<br/>

![](https://cdn.jsdelivr.net/gh/LinXiuci/image/img/m4.png)<br/>

![](https://cdn.jsdelivr.net/gh/LinXiuci/image/img/m6.pngg)<br/>

![](https://cdn.jsdelivr.net/gh/LinXiuci/image/img/m7.png)<br/>

![](https://cdn.jsdelivr.net/gh/LinXiuci/image/img/m8.png)<br/>

![](https://cdn.jsdelivr.net/gh/LinXiuci/image/img/m9.png)<br/>

![](https://cdn.jsdelivr.net/gh/LinXiuci/image/img/m11.png)<br/>

![](https://cdn.jsdelivr.net/gh/LinXiuci/image/img/m10.png)<br/>



### 后台管理

![](https://cdn.jsdelivr.net/gh/LinXiuci/image/img/pc4.png)<br/>

![](https://cdn.jsdelivr.net/gh/LinXiuci/image/img/pc1.png)<br/>

![](https://cdn.jsdelivr.net/gh/LinXiuci/image/img/pc3.png)<br/>

![](https://cdn.jsdelivr.net/gh/LinXiuci/image/img/pc2.png)<br/>

![](https://cdn.jsdelivr.net/gh/LinXiuci/image/img/pc7.png)<br/>

![](https://cdn.jsdelivr.net/gh/LinXiuci/image/img/pc6.png)<br/>

![](https://cdn.jsdelivr.net/gh/LinXiuci/image/img/pc5.png)<br/>



## 项目功能

1. 音乐播放
2. 用户登录注册
3. 用户信息编辑、头像修改
4. 歌曲、歌单搜索
5. 歌单打分
6. 歌单、歌曲评论
7. 歌单列表、歌手列表分页显示
8. 歌词同步显示
9. 音乐收藏、下载、拖动控制、音量控制
10. 后台对用户、歌曲、歌手、歌单信息的管理
11. 等等......

## 运行项目

### 服务器运行（music-server）

1. 去该<a href="https://pan.baidu.com/s/1Qv0ohAIPeTthPK_CDwpfWg"> 链接 </a>【提取码: gwa4】下载依赖的歌曲与图片，将 data 里的文件放到 music-server 根目录下：

   ![](https://cdn.jsdelivr.net/gh/LinXiuci/image/img/1659047718983.jpg)<br/>

2. 将 music-server 目录下的 sql 文件夹中的 tp_music.sql 文件导入数据库中。

3. 将 music-server 目录下的 src\main\resources\application.yml 文件里的 spring:datasource:username 和 spring:datasource:password 修改为你的数据库账号与密码

4. 启动项目

. 在 music-server 中，运行下面命令启动服务器
```
// 方法一
./mvnw spring-boot:run

// 方法二
mvn spring-boot:run // 前提装了 maven

// 方法三
在启动类中点击运行（VsCode）
```

### 客户端与管理端运行（music-client 与 music-manage）

```
npm install // 安装依赖
npm run serve // 启动前台项目

or

yarn
yarn serve
```


