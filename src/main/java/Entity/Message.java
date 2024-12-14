package Entity;


import lombok.*;

import java.time.LocalDateTime;



@AllArgsConstructor
@Getter
@Setter
@Data
public class Message {


    private  String content;

    public String getSender() {
        return sender;
    }

    public void setSender(String sender) {
        this.sender = sender;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public LocalDateTime getTimeStamp() {
        return timeStamp;
    }

    public void setTimeStamp(LocalDateTime timeStamp) {
        this.timeStamp = timeStamp;
    }

    private String sender;
    private LocalDateTime timeStamp;



    public Message(String sender,String content) {
        this.sender = sender;
        this.content= content;
        this.timeStamp=LocalDateTime.now();

    }

    public Message(){
    }
}
