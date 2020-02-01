package com.lambton;

import java.time.LocalDate;

public class Driver extends Person
{
    private String driverLicenceNo;
    private boolean drivingHistoryCleared;
    private float salary;

    public Driver(int id, String firstName, String lastName, Gender gender, LocalDate birthDate, int mobileNumber, String emailId, String userName, String passWord, String driverLicenceNo, boolean drivingHistoryCleared, float salary) {
        super(id, firstName, lastName, gender, birthDate, mobileNumber, emailId, userName, passWord);
        this.driverLicenceNo = driverLicenceNo;
        this.drivingHistoryCleared = drivingHistoryCleared;
        this.salary = salary;
    }

}
