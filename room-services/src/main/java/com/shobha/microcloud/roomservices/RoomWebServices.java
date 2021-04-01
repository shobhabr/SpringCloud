package com.shobha.microcloud.roomservices;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/room")
public class RoomWebServices {

    private final RoomRepository roomRepository;

    public RoomWebServices(RoomRepository roomRepository) {
        super();
        this.roomRepository = roomRepository;
    }

    @GetMapping
    public Iterable<Room> getAllRoomServices(){
        return roomRepository.findAll();
    }

    @GetMapping("/{roomId}")
    public Room getRoomById(@PathVariable("roomId") Long roomId){
        return roomRepository.findById(roomId).get();
    }
}
