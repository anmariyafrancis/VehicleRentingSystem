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

    public FuelTypes getFuelTypes() {
        return fuelTypes;
    }

    public void setFuelTypes(FuelTypes fuelTypes) {
        this.fuelTypes = fuelTypes;
    }
}
