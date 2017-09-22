package com.vehicle.Rental;


public class CityDistance {
    enum distance {

        Pune(0),Mumbai(200),Bangalore(1000),Delhi(2050),Chennai(1234.5);
      double km;
        distance(double km) {
            this.km = km;
        }
    }
}