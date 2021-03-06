package com.lambton;

import java.time.LocalDate;

public class VehicleRent implements IDisplay
{
    private LocalDate rentStartDate;
    private LocalDate rent_End_Date;
    private float rentInNoOfDays;
    private double totalKilometerDrived;
    private float totalBillToPay;

    public VehicleRent(LocalDate rentStartDate, LocalDate rentEndDate, float rentInNoOfDays, double totalKilometerDrived, float totalBillToPay)
    {
        this.rentStartDate = rentStartDate;
        this.rent_End_Date = rentEndDate;
        this.rentInNoOfDays = rentInNoOfDays;
        this.totalKilometerDrived = totalKilometerDrived;
        this.totalBillToPay = totalBillToPay;
    }

    public LocalDate getRentStartDate() {
        return rentStartDate;
    }

    public void setRentStartDate(LocalDate rentStartDate) {
        this.rentStartDate = rentStartDate;
    }

    public LocalDate getRentEndDate() {
        return rent_End_Date;
    }

    public void setRentEndDate(LocalDate rentEndDate) {
        this.rent_End_Date = rentEndDate;
    }

    public float getRentInNoOfDays() {
        return rentInNoOfDays;
    }

    public void setRentInNoOfDays(float rentInNoOfDays) {
        this.rentInNoOfDays = rentInNoOfDays;
    }

    public double getTotalKilometerDrived() {
        return totalKilometerDrived;
    }

    public void setTotalKilometerDrived(double totalKilometerDrived) {

        this.totalKilometerDrived = totalKilometerDrived;
    }

    public float getTotalBillToPay() {
        return totalBillToPay;
    }

    public void setTotalBillToPay(float totalBillToPay) {
        this.totalBillToPay = totalBillToPay;
    }

    @Override
    public void print()
    {
        System.out.println("Vehicle Rent Start Date : " + getRentStartDate());
        System.out.println("Vehicle Rent End Date : " + getRentEndDate());
        System.out.println("Rent In No Of Days" + getRentInNoOfDays());
        System.out.println("Total Kilometer Drived : " + getTotalKilometerDrived());
        System.out.println("Vehicle Rent End Date : " + getRentEndDate());
        System.out.println("Total Bill To Pay" + getTotalBillToPay());
    }

    

}
