package com.stackroute;

public class Vehicle {

    private String vehicleColour;
    private int numberOfWheels;
    private String vehicleFuelType;

    public String getVehicleColour() {
        return vehicleColour;
    }

    public void setVehicleColour(String vehicleColour) {
        this.vehicleColour = vehicleColour;
    }

    public int getNumberOfWheels() {
        return numberOfWheels;
    }

    public void setNumberOfWheels(int numberOfWheels) {
        this.numberOfWheels = numberOfWheels;
    }

    public String getVehicleFuelType() {
        return vehicleFuelType;
    }

    public void setVehicleFuelType(String vehicleFuelType) {
        this.vehicleFuelType = vehicleFuelType;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "vehicleColour='" + vehicleColour + '\'' +
                ", numberOfWheels=" + numberOfWheels +
                ", vehicleFuelType='" + vehicleFuelType + '\'' +
                '}';
    }
}
