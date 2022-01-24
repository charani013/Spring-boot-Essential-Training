package com.spring.room.web.app.roomwebapp.Service;


import java.util.List;

import com.spring.room.web.app.roomwebapp.data.RoomRepository;
import com.spring.room.web.app.roomwebapp.models.Room;

import org.springframework.stereotype.Service;

@Service
public class RoomService {
    private final RoomRepository roomRepository;

    public RoomService(RoomRepository roomRepository) {
        this.roomRepository = roomRepository;
    }

    public List<Room> getAllRooms() {
        return roomRepository.findAll();

    }
    
    
    
}
