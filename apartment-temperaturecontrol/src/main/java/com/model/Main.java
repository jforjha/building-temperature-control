package com.model;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Building building = new Building();
        
        try {
        while(true) {
        	
        
        for (Rooms room : building.getRooms()) {
            System.out.println("Room ID: " + room.getRoomId() +
                               ", Current Room Temperature: " + room.getcurrentTemperature() + " degrees" +
                               ", Heating Switch: " + (room.heatingFlag() ? "ON" : "OFF") +
                               ", Cooling Switch: " + (room.coolingFlag() ? "ON" : "OFF"));
        }
        
        double userInputTemp=0;
        boolean validTemp = false;
        while (!validTemp) {
        	
      try {
        System.out.print("\nkindly give the requested Building Temperature: ");
        userInputTemp = scanner.nextDouble();
      
        if (userInputTemp >= 10 &&  userInputTemp <= 40)
        	{
        	
        	 validTemp = true; 
        	}
        else {
        	System.out.print("\nkindly give the requested Building Temperature between 10 to 40 as the default rooms temperature lies between the range of 10 to 40 degrees ");
        }
        
      }
      catch (InputMismatchException e) {
          System.out.println("Invalid input! Please enter a numeric value.");
          scanner.next(); 
      }
        }
        building.setRequestedBuildingTemperature(userInputTemp);
        
        
        //Room Adding Functionality
        boolean addMoreRooms = true;
        while (addMoreRooms) {
        System.out.print("\nWant to add a new room? \nPress Y for add N for discard: ");
        
        char option = Character.toUpperCase(scanner.next().charAt(0));
        
        if (option == 'Y') {
            System.out.print("Enter Room ID: ");
            int roomId = scanner.nextInt();
            System.out.print("Wants to add an Apartment or Common Room? \nPress A for Apartment and C for Common Room  ");
            char roomType = Character.toUpperCase(scanner.next().charAt(0));

            if (roomType == 'A') {
                System.out.print("Kinldy Enter Owner Name: ");
                String owner = scanner.next();
                building.addRoom(new Apartment(roomId, owner));
            } else if (roomType == 'C') {
                System.out.print("Kindly enter room type: ");
                String type = scanner.next();
                building.addRoom(new commonRoom(roomId, type));
            }else {
                System.out.println("Invalid option. Room not added.");
            }
        }
        else {
            addMoreRooms = false; 
        }
        
        
        System.out.println("Updated room list....");
        for (Rooms room : building.getRooms()) {
            System.out.println("Room ID: " + room.getRoomId() +
                    ", Current Temperature: " + room.getcurrentTemperature() + " degrees");
        }

    
        building.simulateBuildingTemperature();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.print("\nDo you want to continue with adding more rooms to building? (Y to continue, N to exit): ");
					char continueOption = Character.toUpperCase(scanner.next().charAt(0));
					if (continueOption == 'N') {
						break; 
					}
				}
        
        System.out.print("\nDo you want to continue with the Budilding Temperature Control System? (Y to continue, N to exit): ");
        char continueOption = Character.toUpperCase(scanner.next().charAt(0));
        if (continueOption == 'N') {
            System.out.println("Exiting the Budilding Temperature Control System...");
            break; 
        }
        
			}
			} catch (Exception e) {
			System.out.println("An unexpected error occurred: " + e.getMessage());
			} finally {
			scanner.close();
			
			}
			}
      

    }
       
        
        
    


