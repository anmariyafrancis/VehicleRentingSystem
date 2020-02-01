package com.lambton;

import java.time.LocalDate;

public class Customer extends Person
{
    private String address;
    private String city;
    private String vehicleRent;

    public Customer(int id, String firstName, String lastName, Gender gender, LocalDate birthDate, int mobileNumber, String emailId, String userName, String passWord, String address, String city, String vehicleRent) {
        super(id, firstName, lastName, gender, birthDate, mobileNumber, emailId, userName, passWord);
        this.address = address;
        this.city = city;
        this.vehicleRent = vehicleRent;
    }
}
