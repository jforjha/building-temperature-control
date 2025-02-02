package com.model;

import java.util.Random;

public class Rooms {
    private int roomId;
    private double currentTemperature;
    private boolean heatingFlag;
    private boolean coolingFlag;

    public Rooms(int roomId) {
        this.roomId = roomId;
        this.currentTemperature = new Random().nextDouble() * (40 - 10) + 10; 
        this.heatingFlag = false;
        this.coolingFlag = false;
    }

    public int getRoomId() {
        return roomId;
    }

    public double getcurrentTemperature() {
        return currentTemperature;
    }

    public boolean heatingFlag() {
        return heatingFlag;
    }

    public boolean coolingFlag() {
        return coolingFlag;
    }

    public void balanceTemperature(double requestedBuildingTemperature) {
        if (currentTemperature < requestedBuildingTemperature) {
            heatingFlag = true;
            coolingFlag = false;
        } else if (currentTemperature > requestedBuildingTemperature) {
            heatingFlag = false;
            coolingFlag = true;
        } else {
            heatingFlag = false;
            coolingFlag = false;
        }
    }
    
    public void automaticTemperatureChange() {
        if (heatingFlag && currentTemperature < 40) {
        	currentTemperature += 1; 
        } else if (coolingFlag && currentTemperature > 10) {
        	currentTemperature -= 1; 
        }
    }

}
