onlinedoc
=========

A web application similar as Google Doc but much simpler.

该项目是网格课程大程。

网格大程内容说明:
1. codes: 包括网格服务工程(OnlineDoc，基于GT4), Web工程(OnlineDocWeb，J2EE开发), 另外还包括SQL脚本(onlinedoc.sql), 可导入到Mysql数据库中;
2. war: 部署到服务器的War包, 由codes中的两个工程生成, 基本wsrf.war网格服务工程生成的war包, OnlineDocWeb.war为Web工程War包;
3. 网上文档系统说明.doc, 详细介绍系统功能, 实现细节等;
4. readme.txt

网上文档系统部署说明:
1. 安装JDK6.0, Mysql 5.0, Apache Tomcat服务器(自带Apache AXIS), 下载Globus Toolkit 4 Java版(ws-core-4.0.5-bin.zip), 解压.
2. 导入onlinedoc.sql到Mysql数据库中.
3. 部署工程到Apache Tomcat服务器, 具体为把war下的wsrf.war和OnlineDocWeb.war放到Tomcat安装目录下的webapps中.
4. 启动Tomcat服务器, 在浏览器下输入类似: http://localhost:8080/OnlineDocWeb即可.

另外, Mysql数据库, 网格服务工程, Web工程可以安装或部署在不同的机器上. 但需要指定相应的服务器地址. 
1. 网格服务工程访问Mysql数据库可如下配置: wsrf.war\WEB-INF\etc\zju_onlinedoc_grid_UserLogin.gar\jndi-config.xml中有一项值为jdbc:mysql://127.0.0.1:3306/onlinedoc, 改为相当数据库URL即可;
2. Web工程访问网格服务工程可如下配置: nlineDocWeb.war\WEB-INF\classes\zju\onlinedoc\util\config.properties中修改grid.url.UserLoginService的值为相应Grid Service地址.

关于codes编译成war包:
1. 网格服务工程先导入Eclipse下编译, 再调用ant脚本OnlineDoc\buildservice.xml生成War包, 注意需根据实际Globus位置在OnlineDoc\buildservice.properties中的相应路径;
2. Web工程直接在Eclipse下编译导出war包即可.
