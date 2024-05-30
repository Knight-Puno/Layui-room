package com.example.controller;

import org.springframework.stereotype.Component;

import javax.websocket.*;
import javax.websocket.server.ServerEndpoint;
import java.io.IOException;

@Component  //生成对象
@ServerEndpoint(value = "v1/point") //识别成能用ws协议访问的类
public class EndPointController {

    /**
     * 链接建立时被调用
     * @param seesion
     * @param config
     */
    @OnOpen
    public void onOpen(Session seesion, EndPointController config){
        System.out.println("链接建立");
    }

    /**
     * 收到消息时被调用。
     * @param message
     * @param session
     * @throws IOException
     */
    @OnMessage
    public void OnMessage(String message,Session session) throws IOException{
        System.out.println("收到消息："+message);
        //将消息推送到前端
        session.getBasicRemote().sendText("我已经收到了消息"+message);
    }

    @OnClose
    public void OnClosse(Session session, CloseReason reason){
        System.out.println("连接已关闭，关闭理由：" + reason);
    }
}
