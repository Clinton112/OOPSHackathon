package com.stackroute;

import com.stackroute.Vehicle;
import com.stackroute.VehicleFunctions;

public class Car extends Vehicle implements VehicleFunctions {

    @Override
    public String steering(String direction) {
        return "The car moved to : "+ direction;
    }

    @Override
    public String speed(String speedIt) {
        return "Speed is : " + speedIt;
    }


}
