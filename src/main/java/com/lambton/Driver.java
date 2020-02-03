package com.lambton;

import java.time.LocalDate;

public class Driver extends Person
{
    private String driverLicenceNumber;
    private boolean isDrivingHistoryCleared;
    private float salary;

    public Driver(int id, String firstName, String lastName, Gender gender, LocalDate birthDate, String mobileNumber, String emailId, String userName, String passWord, String driverLicenceNumber, boolean isDrivingHistoryCleared, float salary) {
        super(id, firstName, lastName, gender, birthDate, mobileNumber, emailId, userName, passWord);
        this.driverLicenceNumber = driverLicenceNumber;
        this.isDrivingHistoryCleared = isDrivingHistoryCleared;
        this.salary = salary;
    }

    public String getDriverLicenceNumber() {
        return driverLicenceNumber;
    }

    public void setDriverLicenceNumber(String driverLicenceNumber) {
        this.driverLicenceNumber = driverLicenceNumber;
    }

    public boolean isDrivingHistoryCleared() {
        return isDrivingHistoryCleared;
    }

    public void setDrivingHistoryCleared(boolean drivingHistoryCleared) {
        isDrivingHistoryCleared = drivingHistoryCleared;
    }

    public float getSalary()
    {
        return salary;
    }

    public void setSalary(float salary)
    {
        this.salary = salary;
    }

    @Override
    public void print()
    {
            System.out.println("Driver Licence Number: " + getDriverLicenceNumber());
            System.out.println("Salary: " + getSalary());
            System.out.println("Is Driving History Cleared ?: " + isDrivingHistoryCleared());
    }
}
