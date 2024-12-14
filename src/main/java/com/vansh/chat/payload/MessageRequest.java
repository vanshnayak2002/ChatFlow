package com.vansh.chat.payload;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Setter
@Getter
@AllArgsConstructor
public class MessageRequest {

private String content;
private String sender;

    public MessageRequest() {

    }

    public String getRoomId() {
        return roomId;
    }

    public void setRoomId(String roomId) {
        this.roomId = roomId;
    }

    public LocalDateTime getMessageTIme() {
        return messageTIme;
    }

    public void setMessageTIme(LocalDateTime messageTIme) {
        this.messageTIme = messageTIme;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getSender() {
        return sender;
    }

    public void setSender(String sender) {
        this.sender = sender;
    }

    private String roomId;

private LocalDateTime messageTIme;

}
