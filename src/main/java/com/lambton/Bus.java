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

public class Bus extends Vehicles
{
    private ArrayList<String> busType=new ArrayList<String>();
    private BusAccessibility isBusAccess;
    private WifiAccessibility isWifiAccess;

    public Bus(int vechicleId, String vehicleDetails, String manufacturerName, String insuranceProviderName, int noOfSeats, FuelTypes fuelTypes, ArrayList<String> busType, BusAccessibility isBusAccess, WifiAccessibility isWifiAccess)
    {
        super(vechicleId, vehicleDetails, manufacturerName, insuranceProviderName, noOfSeats, fuelTypes);
        this.busType = busType;
        this.isBusAccess = isBusAccess;
        this.isWifiAccess = isWifiAccess;
    }

    public ArrayList<String> getBusType() {
        return busType;
    }

    public void setBusType(ArrayList<String> busType) {
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

    public void display()
    {
        System.out.println("Bus Identification Number : " + getVechicleId());
        System.out.println("Bus Details : "+getVehicleDetails());
        System.out.println("Bus Manufacturer's name : "+getManufacturerName());
        System.out.println("Bus is self driving : "+isVehicleIsSelfDrive());
        System.out.println("Bus Driver Name : "+getVehicleDriverName());
        System.out.println("Bus Insurance Provider's Name : "+isVehicleIsInsured());
        System.out.println("Bus no. of seats : "+getNoOfSeats());
        System.out.println("Bus Base Rate Per Day : "+getBaseRatePerDay());
        System.out.println("Bus Rate per Hour : "+getRatePerKilometer());
        System.out.println("Is bus Insured? : "+isVehicleIsInsured());
        System.out.println("Bus Fuel Type : "+getFuelType());
        System.out.println("Bus Type : "+getBusType());
        System.out.println("Is wifi Available ? : "+getIsWifiAccess());
        System.out.println("Is bus access now? : "+getIsBusAccess());
    }

}
