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
    private BusAccessibility busAccess;
    private WifiAccessibility wifiAccess;

    public Bus(int vechicleId, String vehicleDetails, String manufacturerName, String insuranceProviderName, int noOfSeats, FuelTypes fuelTypes)
    {
        super(vechicleId, vehicleDetails, manufacturerName, insuranceProviderName, noOfSeats, fuelTypes);
    }
    public ArrayList<String> getBusType() {
        return busType;
    }

    public void setBusType(ArrayList<String> busType) {
        this.busType = busType;
    }

    public BusAccessibility getBusAccess() {
        return busAccess;
    }

    public void setBusAccess(BusAccessibility busAccess) {
        this.busAccess = busAccess;
    }

    public WifiAccessibility getWifiAccess() {
        return wifiAccess;
    }

    public void setWifiAccess(WifiAccessibility wifiAccess) {
        this.wifiAccess = wifiAccess;
    }

}
