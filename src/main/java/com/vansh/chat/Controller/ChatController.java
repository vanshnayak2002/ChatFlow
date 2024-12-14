package com.vansh.chat.Controller;

import Entity.Message;
import Entity.Room;
import com.vansh.chat.Respository.RoomRepository;
import com.vansh.chat.config.AppConstant;
import com.vansh.chat.payload.MessageRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.handler.annotation.DestinationVariable;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;

import java.time.LocalDate;
import java.time.LocalDateTime;

@CrossOrigin(AppConstant.FRONT_END_WEB_URL)
@Controller
public class ChatController {



private RoomRepository roomRepository;

    public ChatController(RoomRepository roomRepository) {
        this.roomRepository = roomRepository;
    }

    //for sending and reciving messages
    @MessageMapping("/sendMessage/{roomId}")
    @SendTo("/topic/room/{roomId}")
    public Message sendMessasge(
            @DestinationVariable String roomId,
            @RequestBody MessageRequest request
    ){
    Room room =  roomRepository.findByRoomId(request.getRoomId());
    Message message=new Message();
    message.setContent(request.getContent());
    message.setSender(request.getSender());
    message.setTimeStamp(LocalDateTime.now());

     if(room!=null){
         room.getMessages().add(message);
         roomRepository.save(room);
     }else{
         throw new RuntimeException("Room not found");
     }
     return message;

    }



}
