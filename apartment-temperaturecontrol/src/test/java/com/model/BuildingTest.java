package com.model;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Before;
import org.junit.Test;

public class BuildingTest {

    private Building building;

    @Before
    public void setUp() {
        building = new Building();
    }

    @Test
    public void testrequestedtemp() {
        double temp = 15;
        building.setRequestedBuildingTemperature(temp);
        assertEquals("Building temperature set to 15.5.", temp, building.getRequestedBuildingTemperature(), 0);
    }

    @Test
    public void testInvalidRequestedtemp() {
        double invalidTemp = 2.0;
        building.setRequestedBuildingTemperature(invalidTemp);
        assertNotEquals("Building temperature set to 2", invalidTemp, building.getRequestedBuildingTemperature(), 0);
    }

    @Test
    public void testAddRoom() {
        Apartment apartment = new Apartment(5, "gaurav");
        building.addRoom(apartment);
        assertEquals( 5, building.getRooms().size());
    }

    @Test
    public void testSimulateBuildingTemperature() {
        building.simulateBuildingTemperature();
        assertNotNull("The building temperature should be adjusted.", building.getRequestedBuildingTemperature());
    }

    @Test
    public void testRoomTemperatureAdjustment() {
        Apartment apartment = new Apartment((int) 10.0, "Gaurav");
        apartment.balanceTemperature(10.0);
        assertEquals("Room temperature should be increased by 20.0 degrees.", 20.0, apartment.getcurrentTemperature(), 0);
    }
}
