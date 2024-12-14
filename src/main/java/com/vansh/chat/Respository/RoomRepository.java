package com.vansh.chat.Respository;

import Entity.Room;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoomRepository extends MongoRepository<Room,String> {

    //Get a room by roomid
    public Room findByRoomId(String roomId);


}
