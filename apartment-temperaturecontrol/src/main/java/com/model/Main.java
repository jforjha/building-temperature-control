package com.model;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Building building = new Building();
        
        while (true) {
        
        for (Rooms room : building.getRooms()) {
            System.out.println("Room ID: " + room.getRoomId() +
                               ", Current Room Temperature: " + room.getcurrentTemperature() + " degrees" +
                               ", Heating Switch: " + (room.heatingFlag() ? "ON" : "OFF") +
                               ", Cooling Switch: " + (room.coolingFlag() ? "ON" : "OFF"));
        }
        
        System.out.print("kindly give the requested Building Temperature: ");
        double userInputTemp = scanner.nextDouble();
        if (userInputTemp < 10 ||  userInputTemp > 40)
        	{
        	 System.out.print("\nkindly give the requested Building Temperature between 10 to 40 as the default rooms temperature lies between the range of 10 to 40 degrees ");
        	continue;
        	}
       
        building.setRequestedBuildingTemperature(userInputTemp);
        
        
        //Room Adding Functionality
        
        System.out.print("\nWant to add a new room? \nPress Y for add N for discard: ");
        
        char option = scanner.next().charAt(0);
        
        if (option == 'Y') {
            System.out.print("Enter Room ID: ");
            int roomId = scanner.nextInt();
            System.out.print("Wants to add an Apartment or Common Room? \nPress A for Apartment and C for Common Room  ");
            char roomType = scanner.next().charAt(0);

            if (roomType == 'A') {
                System.out.print("Kinldy Enter Owner Name: ");
                String owner = scanner.next();
                building.addRoom(new Apartment(roomId, owner));
            } else {
                System.out.print("Kindly enter room type: ");
                String type = scanner.next();
                building.addRoom(new commonRoom(roomId, type));
            }
        }

        
       
    }
        
    }

}
