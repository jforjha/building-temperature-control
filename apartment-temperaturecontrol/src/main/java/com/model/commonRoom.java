package com.model;

public class commonRoom extends Rooms {
    private String roomCategory; 

    public commonRoom(int roomId, String roomCategory) {
        super(roomId);
        this.roomCategory = roomCategory;
    }

    public String getRoomCategory() {
        return roomCategory;
    }
}
