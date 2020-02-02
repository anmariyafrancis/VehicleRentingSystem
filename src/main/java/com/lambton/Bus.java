package com.lambton;

import java.util.ArrayList;

enum BusAccessibility
{
    Yes,
    No
}
enum WifiAccessibility
{
    Yes,
    No
}

public class Bus extends Vehicles implements IDisplay
{
    private ArrayList<String> busType=new ArrayList<String>();

    public Bus(int vechicleId, String vehicleDetails, String manufacturerName, String insuranceProviderName, int noOfSeats, FuelTypes fuelTypes)
    {
        super(vechicleId, vehicleDetails, manufacturerName, insuranceProviderName, noOfSeats, fuelTypes);
    }
}
