package com.duy.WebsocketChatApp.chat;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ChatMessage {
    private String message;
    private String sender;
    private MessageType type;
}
