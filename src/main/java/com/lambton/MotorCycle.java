package com.lambton;

public class MotorCycle extends Vehicles
{
    private float MaximumSpeed;
    private float milage;
    public MotorCycle(int vechicleId, String vehicleDetails, String manufacturerName, String insuranceProviderName, int noOfSeats, FuelTypes fuelTypes)
    {
        super(vechicleId, vehicleDetails, manufacturerName, insuranceProviderName, noOfSeats, fuelTypes);
    }

    public float getMilage() {
        return milage;
    }

    public void setMilage(float milage) {
        this.milage = milage;
    }

    public float getMaximumSpeed() {
        return MaximumSpeed;
    }

    public void setMaximumSpeed(float maximumSpeed) {
        MaximumSpeed = maximumSpeed;
    }
}
