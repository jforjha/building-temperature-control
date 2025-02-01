package com.model;

public class Main {
    public static void main(String[] args) {
        Building building = new Building();
        System.out.println("Requested Building Temperature: " + building.getRequestedBuildingTemperature() + "degrees");
        
        for (Rooms room : building.getRooms()) {
            System.out.println("Room ID: " + room.getRoomId() +
                               ", Current Room Temperature: " + room.getcurrentTemperature() + "degrees" +
                               ", Heating Switch: " + (room.heatingFlag() ? "ON" : "OFF") +
                               ", Cooling Switch: " + (room.coolingFlag() ? "ON" : "OFF"));
        }
    }

}
