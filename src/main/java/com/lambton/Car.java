package com.lambton;

import java.util.ArrayList;

public class Car extends Vehicles
{
    private ArrayList<String> carType=new ArrayList<String>();
    private ArrayList<String> carColor=new ArrayList<String>();

    public Car(int vechicleId, String vehicleDetails, String manufacturerName, String insuranceProviderName, int noOfSeats, FuelTypes fuelTypes)
    {
        super(vechicleId, vehicleDetails, manufacturerName, insuranceProviderName, noOfSeats, fuelTypes);
    }

    public ArrayList<String> getCarType()
    {
        return carType;
    }

    public void setCarType(ArrayList<String> carType)
    {
        this.carType = carType;
    }

    public ArrayList<String> getCarColor()
    {
        return carColor;
    }

    public void setCarColor(ArrayList<String> carColor)
    {
        this.carColor = carColor;
    }
}
