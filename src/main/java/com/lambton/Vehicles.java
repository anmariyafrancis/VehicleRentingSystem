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

    public Vehicles(int vechicleId, String vehicleDetails, String manufacturerName, String insuranceProviderName, int noOfSeats, FuelTypes fuelTypes)
    {
        this.vechicleId = vechicleId;
        this.vehicleDetails = vehicleDetails;
        this.manufacturerName = manufacturerName;
        this.insuranceProviderName = insuranceProviderName;
        this.noOfSeats = noOfSeats;
        this.fuelTypes = fuelTypes;
    }

    public int getVechicleId() {
        return vechicleId;
    }

    public void setVechicleId(int vechicleId)
    {
        this.vechicleId = vechicleId;
    }

    public String getVehicleDetails()
    {
        return vehicleDetails;
    }

    public void setVehicleDetails(String vehicleDetails)
    {
        this.vehicleDetails = vehicleDetails;
    }

    public String getManufacturerName()
    {
        return manufacturerName;
    }

    public void setManufacturerName(String manufacturerName)
    {
        this.manufacturerName = manufacturerName;
    }

    public String getInsuranceProviderName()
    {
        return insuranceProviderName;
    }

    public void setInsuranceProviderName(String insuranceProviderName)
    {
        this.insuranceProviderName = insuranceProviderName;
    }

    public int getNoOfSeats()
    {
        return noOfSeats;
    }

    public void setNoOfSeats(int noOfSeats)
    {
        this.noOfSeats = noOfSeats;
    }

    public FuelTypes getFuelTypes()
    {
        return fuelTypes;
    }

    public void setFuelTypes(FuelTypes fuelTypes)
    {
        this.fuelTypes = fuelTypes;
    }
}
