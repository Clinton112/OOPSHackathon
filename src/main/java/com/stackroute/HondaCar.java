package com.stackroute;
public class HondaCar extends Car implements ChangeGear{

    private String type;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }



    @Override
    public String gearChange(String shiftGear) {
        return "Gear is : "+ shiftGear;
    }

    @Override
    public String getVehicleColour() {
        return super.getVehicleColour();
    }

    @Override
    public int getNumberOfWheels() {
        return super.getNumberOfWheels();
    }

    @Override
    public String getVehicleFuelType() {
        return super.getVehicleFuelType();
    }

}
