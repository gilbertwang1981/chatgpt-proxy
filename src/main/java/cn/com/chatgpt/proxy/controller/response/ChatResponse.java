package cn.com.chatgpt.proxy.controller.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class ChatResponse {
    @JsonProperty("question_tokens")
    private long questionTokens = 0;
}
