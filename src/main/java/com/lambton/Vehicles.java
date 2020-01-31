package com.lambton;

enum FuelTypes
{
    Petrol,
    Diesel,
    Electric
}

public abstract class Vehicles
{
    private int vechicleId;
    private String vehicleDetails;
    private String manufacturerName;
    private String insuranceProviderName;
    private int noOfSeats;
    private FuelTypes fuelTypes;
}
