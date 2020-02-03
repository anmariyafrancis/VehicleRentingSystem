package com.lambton;

enum FuelTypes
{
    Petrol,
    Diesel,
    Electric
}

public abstract class Vehicles implements IDisplay
{
    protected String vechicleId;
    protected String vehicleDetails;
    protected String manufacturerName;
    protected String vehicleIsSelfDrive;
    protected String vehicleDriverName;
    protected String vehicleIsInsured;
    protected String insuranceProviderName;
    protected int noOfSeats;
    protected FuelTypes fuelType;
    protected float baseRatePerDay;
    protected float ratePerKilometer;

    public Vehicles(String vechicleId, String vehicleDetails, String manufacturerName, String vehicleIsSelfDrive, String vehicleDriverName, String vehicleIsInsured, String insuranceProviderName, int noOfSeats, FuelTypes fuelType, Float baseRatePerDay, Float ratePerKilometer)
    {
        this.vechicleId = vechicleId;
        this.vehicleDetails = vehicleDetails;
        this.manufacturerName = manufacturerName;
        this.vehicleIsSelfDrive = vehicleIsSelfDrive;
        this.vehicleDriverName = vehicleDriverName;
        this.vehicleIsInsured = vehicleIsInsured;
        this.insuranceProviderName = insuranceProviderName;
        this.noOfSeats = noOfSeats;
        this.fuelType = fuelType;
        this.baseRatePerDay = baseRatePerDay;
        this.ratePerKilometer = ratePerKilometer;
    }

    public String getVechicleId() {
        return vechicleId;
    }

    public void setVechicleId(String vechicleId) {
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

    public String getVehicleIsSelfDrive() {
        return vehicleIsSelfDrive;
    }
    public void setVehicleIsSelfDrive(String vehicleIsSelfDrive) {
        this.vehicleIsSelfDrive = vehicleIsSelfDrive;
    }

    public String getVehicleDriverName() {
        return vehicleDriverName;
    }

    public void setVehicleDriverName(String vehicleDriverName) {
        this.vehicleDriverName = vehicleDriverName;
    }

    public String getVehicleIsInsured() {
        return vehicleIsInsured;
    }

    public void setVehicleIsInsured(String vehicleIsInsured) {
        this.vehicleIsInsured = vehicleIsInsured;
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

    public float getBaseRatePerDay() {
        return baseRatePerDay;
    }

    public void setBaseRatePerDay(float baseRatePerDay) {
        this.baseRatePerDay = baseRatePerDay;
    }

    public float getRatePerKilometer() {
        return ratePerKilometer;
    }

    public void setRatePerKilometer(float ratePerKilometer) {
        this.ratePerKilometer = ratePerKilometer;
    }
}

