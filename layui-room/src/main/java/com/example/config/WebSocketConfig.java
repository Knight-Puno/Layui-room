package com.example.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.socket.server.standard.ServerEndpointExporter;

/**
 * 主要是将目前的类定义成一个websocket服务器端, 注解的值将被用于监听用户连接的终端访问URL地址,客户端可以
 * 通过这个URL来连接到WebSocket服务器端
 */
@Configuration //表示这是个配置类，用法和 @Component 注解没有区别
public class WebSocketConfig {
    /**
     * @return
     * @Bean 注解会把该方法的返回值当做一个JavaBean，存放在Spring上下文中，以供使用
     * ServerEndpointExporter类的作用是，会扫描所有的服务器端点
     * 把带有 @ServerEndpoint 注解的所有类都添加进来
     * Spring Boot = Spring + MVC
     */
    @Bean
    public ServerEndpointExporter serverEndpointExporter() {
        return new ServerEndpointExporter();
    }
}