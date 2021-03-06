常用命令为 ：

    mvn archetype:create ：创建 Maven 项目

    mvn compile ：编译源代码

    mvn test-compile ：编译测试代码

    mvn test ： 运行应用程序中的单元测试

    mvn site ： 生成项目相关信息的网站

    mvn clean ：清除目标目录中的生成结果

    mvn package ： 依据项目生成 jar 文件

    mvn install ：在本地 Repository 中安装 jar

    mvn deploy：将jar包发布到远程仓库

    mvn eclipse:eclipse ：生成 Eclipse 项目文件

生成项目

   建一个 JAVA 项目 ： mvn archetype:create -DgroupId=com.test -DartifactId=App

   建一个 web 项目 ： mvn archetype:create -DgroupId=com.test -DartifactId=web-app -DarchetypeArtifactId=maven-archetype-webapp

解释：

   archetype 是一个内建插件，它的create任务将建立项目骨架

   archetypeArtifactId 项目骨架的类型

   groupId 项目的java包结构，可修改 artifactId 项目的名称，生成的项目目录也是这个名字，可修改

可用项目骨架有：

   maven-archetype-archetype

   maven-archetype-j2ee-simple

   maven-archetype-mojo

   maven-archetype-portlet

   maven-archetype-profiles (currently under development)

   maven-archetype-quickstart

   maven-archetype-simple (currently under development)

   maven-archetype-site

   maven-archetype-site-simple

   maven-archetype-webapp

web项目目录结构的布局：

   详见http://maven.apache.org/guides/introduction/introduction-to-the-standard-directory-layout.html

Eclipse导入已存在的maven项目 ：

    在导入之前需要在项目根目录下面执行如下命令：

 普通 Eclipse 项目执行 ： mvn eclipse:eclipse Eclipse

 web 项目执行 ： mvn eclipse:eclipse –Dwtpversion=1.0

    然后通过Eclipse的maven插件中选择导入已存在的maven项目即可将其导入。

学习过程中的问题：

     安装好m2eclipse插件后一般会报错误：Eclipse is running in a JRE, but a JDK is required Some Maven plugins may not work when importing projects or updating source folders.

    解决方式为：

1.创建一个Eclipse的启动的快捷方式，在其启动路径后添加-vm 你的JDK安装路径/bin/javaw.exe

2.在eclipse的安装目录下打开eclipse.ini中的-vmargs上面添加-vm 你的JDK安装路径/bin/javaw.exe         

    eclipse导入创建的web项目问题

在用eclipse导入web项目时 如果eclipse安装了wtp插件在会自动将其转化为eclipse认得到的web项目，在项目上面点击右键run as 的run on server可以用，但是当eclipse没有安装wtp插件时run on server则不用，
此时的解决方式为用命令行切换到项目的根目录然后执行 mvn eclipse:eclipse –Dwtpversion=1.0即可解决。


当添加进入一个jar包后，有一些属性需要设置，最重要的就是scope，它有以下几种取值：

1. compile，缺省值，适用于所有阶段，会随着项目一起发布。

2. provided，类似compile，期望JDK、容器或使用者会提供这个依赖。如servlet.jar。

3. runtime，只在运行时使用，如JDBC驱动，适用运行和测试阶段。

4. test，只在测试时使用，用于编译和运行测试代码。不会随项目发布。

5. system，类似provided，需要显式提供包含依赖的jar，Maven不会在 Repository中查找它。