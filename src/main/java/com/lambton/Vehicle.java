package com.lambton;

enum FuelType
{
    Petrol,
    Diesel,
    Electric
}

public abstract class Vehicle
{
    private int vechicleId;
    private String vehicleDetails;
    private String manufacturerName;
    private String insuranceProviderName;
    private int noOfSeat;
    private FuelType fuelType;
}
