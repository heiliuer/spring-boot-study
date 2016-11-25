## 002devtools

> [refrerence1](https://spring.io/blog/2015/06/17/devtools-in-spring-boot-1-3)

> [refrerence2](http://docs.spring.io/spring-boot/docs/current-SNAPSHOT/reference/html/using-boot-devtools.html#using-boot-devtools-restart-additional-paths)


- Devtools use some tricks to autoload browser as you src change and other awesome functions.
    
    - auto disable Thymleaf cache.
    
    - remote refresh apps which are runnning on docker eg. 
    

- 配置 devtools ，加入依赖即可，devtools默认是enable配置

        <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-devtools</artifactId>
        </dependency>
        
    > `System.setProperty("spring.devtools.restart.enabled", "false");` disable devtools

- 启动App，devtools 启动时日志 

    `LiveReload server is running on port 35729`
    
    > liveReload 固定端口 35729
    
    > chrome 安装 [liveload 插件](https://chrome.google.com/webstore/detail/livereload/jnihajbhpnppcggbcgedagnkighmdlei) 安装完，点击插件图标 enable
    
    

