package com.vehicle.Rental;

public abstract class Vehicle {


    public static double acRate(String actype) {

        if (actype.equalsIgnoreCase("AC"))
            return 2;
        else
            return 0;
    }


    public static double fuelRate(String fuelType) {
        if (fuelType.equalsIgnoreCase("Petrol"))
            return 9;
        else if (fuelType.equalsIgnoreCase("Diesel"))
            return 8;
        else
            return 0;
    }


    public static double calculateDistance(String city) {


        String splitCityName[] = city.split("-");

        String departure = splitCityName[0];
        String destination = splitCityName[1];
        double distance = (CityDistance.distance.valueOf(departure).km) + (CityDistance.distance.valueOf(destination).km);
        return distance;

    }

    abstract double getTotalExpense(String input);
}