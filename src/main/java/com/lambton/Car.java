package com.lambton;

import java.util.ArrayList;

public class Car extends Vehicles
{
    private String carType;
    private String carColor;

    public Car(String vechicleId, String vehicleDetails, String manufacturerName, String vehicleIsSelfDrive, String vehicleDriverName, String vehicleIsInsured, String insuranceProviderName, int noOfSeats, FuelTypes fuelType, Float baseRatePerDay, Float ratePerKilometer, String carType, String CarColor)
    {
        super(vechicleId, vehicleDetails, manufacturerName, vehicleIsSelfDrive, vehicleDriverName, vehicleIsInsured, insuranceProviderName, noOfSeats, fuelType, baseRatePerDay, ratePerKilometer);
        this.carType = carType;
        this.carColor = carColor;
    }

    public String getCarType() {
        return carType;
    }

    public void setCarType(String carType) {
        this.carType = carType;
    }

    public String getCarColor() {
        return carColor;
    }

    public void setCarColor(String carColor) {
        this.carColor = carColor;
    }

    @Override
    public void print()
    {
        System.out.println("Car Identification Number : " + getVechicleId());
        System.out.println("Car Details : "+getVehicleDetails());
        System.out.println("Car Manufacturer's name : "+getManufacturerName());
      //  System.out.println("is car self driving ? : "+isVehicleIsSelfDrive());
        System.out.println("Car Driver Name : "+getVehicleDriverName());
        //System.out.println("Is car insured ? : "+isVehicleIsInsured());
        System.out.println("Car Insurance Provider's Name : "+getInsuranceProviderName());
        System.out.println("Car no. of seats : "+getNoOfSeats());
        System.out.println("Car Fuel Type : "+getFuelType());
        System.out.println("Car Base Rate Per Day : "+getBaseRatePerDay());
        System.out.println("Car Rate per Hour : "+getRatePerKilometer());
        System.out.println("Car Type : "+getCarType());
        System.out.println("Car color : "+getCarColor());
    }
}
