package com.vehicle.Rental;

public  class SUV extends Vehicle {

    private final boolean isAC = true;

    public boolean isAC() {
        return isAC;
    }

    @Override
    double getTotalExpense(String input) {
        double output = 0.0;
        String splitInput[] = input.split(" ");
        String vehicleName = splitInput[0];
        String city = splitInput[1];


        double distance = Vehicle.calculateDistance(city);
        double fuelRate = Vehicle.fuelRate("Diesel");
        double acRate = Vehicle.acRate("AC");
        double busDiscount = Bus.busDiscount(vehicleName);


        if (vehicleName.equalsIgnoreCase("SUV"))
            output = distance * (fuelRate + acRate);


        return output;

    }
}








