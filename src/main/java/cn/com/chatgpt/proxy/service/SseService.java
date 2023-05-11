package cn.com.chatgpt.proxy.service;

import cn.com.chatgpt.proxy.controller.request.ChatRequest;
import cn.com.chatgpt.proxy.controller.response.ChatResponse;

import org.springframework.web.servlet.mvc.method.annotation.SseEmitter;

public interface SseService {
    SseEmitter createSse(String uid);

    void closeSse(String uid);

    ChatResponse sseChat(String uid, ChatRequest chatRequest);
}
