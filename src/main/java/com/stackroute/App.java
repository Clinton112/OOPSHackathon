package com.stackroute;

/**
 * Hello world!
 *
 */
public class App 
{

    public static void main(String[] args) {

        HondaCar hondaCar = new HondaCar();

        hondaCar.setVehicleColour("white");
        hondaCar.setNumberOfWheels(4);
        hondaCar.setVehicleFuelType("Diesel");

        hondaCar.steering("Right");
        hondaCar.speed("Increase");

        hondaCar.gearChange("Up");
        hondaCar.setType("Electric");

        System.out.println(hondaCar.toString());
        System.out.println("The specific about this Honda city : "+hondaCar.getType()+ " type");

    }
}