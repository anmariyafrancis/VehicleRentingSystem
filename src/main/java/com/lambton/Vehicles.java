package com.lambton;

import java.util.HashMap;

enum FuelTypes
{
    Petrol,
    Diesel,
    Electric
}

public abstract class Vehicles implements IDisplay
{
    private int vechicleId;
    private String vehicleDetails;
    private String manufacturerName;
    private String vehicleDriverName;
    private String insuranceProviderName;
    private int noOfSeats;
    private FuelTypes fuelType;
    private HashMap<String,Float> baseRatePerDay=new HashMap<String, Float>();
    private HashMap<String,Float> ratePerKilometer=new HashMap<String, Float>();

    public Vehicles(int vechicleId, String vehicleDetails, String manufacturerName, String insuranceProviderName, int noOfSeats, FuelTypes fuelTypes)
    {
        this.vechicleId = vechicleId;
        this.vehicleDetails = vehicleDetails;
        this.manufacturerName = manufacturerName;
        this.insuranceProviderName = insuranceProviderName;
        this.noOfSeats = noOfSeats;
        this.fuelType = fuelType;
    }

    public int getVechicleId() {
        return vechicleId;
    }

    public void setVechicleId(int vechicleId) {
        this.vechicleId = vechicleId;
    }

    public String getVehicleDetails() {
        return vehicleDetails;
    }

    public void setVehicleDetails(String vehicleDetails) {
        this.vehicleDetails = vehicleDetails;
    }

    public String getManufacturerName() {
        return manufacturerName;
    }

    public void setManufacturerName(String manufacturerName) {
        this.manufacturerName = manufacturerName;
    }

    public String getVehicleDriverName() {
        return vehicleDriverName;
    }

    public void setVehicleDriverName(String vehicleDriverName) {
        this.vehicleDriverName = vehicleDriverName;
    }

    public String getInsuranceProviderName() {
        return insuranceProviderName;
    }

    public void setInsuranceProviderName(String insuranceProviderName) {
        this.insuranceProviderName = insuranceProviderName;
    }

    public int getNoOfSeats() {
        return noOfSeats;
    }

    public void setNoOfSeats(int noOfSeats) {
        this.noOfSeats = noOfSeats;
    }

    public FuelTypes getFuelType() {
        return fuelType;
    }

    public void setFuelType(FuelTypes fuelType) {
        this.fuelType = fuelType;
    }

    public HashMap<String, Float> getBaseRatePerDay() {
        return baseRatePerDay;
    }

    public void setBaseRatePerDay(HashMap<String, Float> baseRatePerDay) {
        this.baseRatePerDay = baseRatePerDay;
    }

    public HashMap<String, Float> getRatePerKilometer() {
        return ratePerKilometer;
    }

    public void setRatePerKilometer(HashMap<String, Float> ratePerKilometer) {
        this.ratePerKilometer = ratePerKilometer;
    }
}
