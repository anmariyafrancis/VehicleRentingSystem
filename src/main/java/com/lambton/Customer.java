package com.lambton;

import java.time.LocalDate;

public class Customer extends Person
{
    private String address;
    private String city;
    private String vehicleRent;

    public Customer(int id, String firstName, String lastName, Gender gender, LocalDate birthDate, String mobileNumber, String emailId, String userName, String passWord, String address, String city, String vehicleRent) {
        super(id, firstName, lastName, gender, birthDate, mobileNumber, emailId, userName, passWord);
        this.address = address;
        this.city = city;
        this.vehicleRent = vehicleRent;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getVehicleRent() {
        return vehicleRent;
    }

    public void setVehicleRent(String vehicleRent) {
        this.vehicleRent = vehicleRent;
    }

    @Override
    public void print()
    {
        System.out.println("Customer Address: " + getAddress());
        System.out.println("Customer City: " + getCity());
        System.out.println("Vehicle Rent: " + getVehicleRent());
    }
}
