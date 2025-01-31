package com.model;

public class Apartment extends Rooms {
    private String apartmentOwnerName;

    public Apartment(int roomId, String apartmentOwnerName) {
        super(roomId);
        this.apartmentOwnerName = apartmentOwnerName;
    }

    public String getApartmentOwnerName() {
        return apartmentOwnerName;
    }
}
