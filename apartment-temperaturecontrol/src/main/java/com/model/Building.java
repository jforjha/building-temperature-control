package com.model;

import java.util.ArrayList;
import java.util.List;

public class Building {
    private List<Rooms> rooms;
    private double requestedBuildingTemperature;

    public Building() {
        this.requestedBuildingTemperature = 25.0;
        this.rooms = new ArrayList<>();
        rooms.add(new Apartment(101, "XYZ"));
        rooms.add(new Apartment(102, "ABC"));
        rooms.add(new commonRoom(1, "'Laundry'"));
        rooms.add(new commonRoom(2, "Library"));

        setRoomtemp();
    }

    public List<Rooms> getRooms() {
        return rooms;
    }

    public double getRequestedBuildingTemperature() {
        return requestedBuildingTemperature;
    }

    public void setRequestedBuildingTemperature(double temperature) {
        this.requestedBuildingTemperature = temperature;
        setRoomtemp();
    }

    private void setRoomtemp() {
        for (Rooms room : rooms) {
        	
            room.balanceTemperature(requestedBuildingTemperature);
        
        }
    }
}
