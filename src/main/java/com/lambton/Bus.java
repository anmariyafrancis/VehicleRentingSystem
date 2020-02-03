package com.lambton;

import java.util.ArrayList;
import java.util.HashMap;

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

public class Bus extends Vehicles
{
    private String busType;
    private BusAccessibility isBusAccess;
    private WifiAccessibility isWifiAccess;

    public Bus(String vechicleId, String vehicleDetails, String manufacturerName, String vehicleIsSelfDrive, String vehicleDriverName, String vehicleIsInsured, String insuranceProviderName, int noOfSeats, FuelTypes fuelType, Float baseRatePerDay, Float ratePerKilometer, String busType, BusAccessibility isBusAccess, WifiAccessibility isWifiAccess)
    {
        super(vechicleId, vehicleDetails, manufacturerName, vehicleIsSelfDrive, vehicleDriverName, vehicleIsInsured, insuranceProviderName, noOfSeats, fuelType, baseRatePerDay, ratePerKilometer);
        this.busType = busType;
        this.isBusAccess = isBusAccess;
        this.isWifiAccess = isWifiAccess;
    }

    public String getBusType() {
        return busType;
    }

    public void setBusType(String busType) {
        this.busType = busType;
    }

    public BusAccessibility getIsBusAccess() {
        return isBusAccess;
    }

    public void setIsBusAccess(BusAccessibility isBusAccess) {
        this.isBusAccess = isBusAccess;
    }

    public WifiAccessibility getIsWifiAccess() {
        return isWifiAccess;
    }

    public void setIsWifiAccess(WifiAccessibility isWifiAccess) {
        this.isWifiAccess = isWifiAccess;
    }

    @Override
    public void print()
    {

        System.out.println("Bus Type : "+getBusType());
        System.out.println("Is wifi Available ? : "+getIsWifiAccess());
        System.out.println("Is bus access now? : "+getIsBusAccess());
    }

}
