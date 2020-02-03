package com.lambton;

public class MotorCycle extends Vehicles
{
    private float maximumSpeed;
    private float milage;

    public MotorCycle(String vechicleId, String vehicleDetails, String manufacturerName, String vehicleIsSelfDrive, String vehicleDriverName, String vehicleIsInsured, String insuranceProviderName, int noOfSeats, FuelTypes fuelType, Float baseRatePerDay, Float ratePerKilometer, float maximumSpeed, float milage)
    {
        super(vechicleId, vehicleDetails, manufacturerName, vehicleIsSelfDrive, vehicleDriverName, vehicleIsInsured, insuranceProviderName, noOfSeats, fuelType, baseRatePerDay, ratePerKilometer);
        this.maximumSpeed = maximumSpeed;
        this.milage = milage;
    }

    public float getMaximumSpeed() {
        return maximumSpeed;
    }

    public void setMaximumSpeed(float maximumSpeed) { this.maximumSpeed = maximumSpeed;
    }

    public float getMilage() {
        return milage;
    }

    public void setMilage(float milage) {
        this.milage = milage;
    }

    @Override
    public void print()
    {
        System.out.println("MotorCycle Identification Number : " + getVechicleId());
        System.out.println("MotorCycle Details : "+getVehicleDetails());
        System.out.println("MotorCycle Manufacturer's name : "+getManufacturerName());
       // System.out.println("Is MotorCycle Insured? : "+isVehicleIsInsured());
        System.out.println("MotorCycle Insurance Provider's Name : "+getInsuranceProviderName());
        System.out.println("MotorCycle Fuel Type : "+getFuelType());
        System.out.println("MotorCycle Base Rate Per Day : "+getBaseRatePerDay());
        System.out.println("MotorCycle Rate per Hour : "+getRatePerKilometer());
        System.out.println("MotorCycle maximum speed : "+getMaximumSpeed());
        System.out.println("MotorCycle milage: "+getMilage());
    }
}
