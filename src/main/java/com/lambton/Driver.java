package com.lambton;

import java.time.LocalDate;

public class Driver extends Person
{
    private String driverLicenceNumber;
    private boolean isDrivingHistoryCleared;
    private float salary;

    public Driver(int id, String firstName, String lastName, Gender gender, LocalDate birthDate, int age, int mobileNumber, String emailId, String userName, String passWord, String driverLicenceNo, boolean drivingHistoryCleared, float salary)
    {
        super(id, firstName, lastName, gender, birthDate, age, mobileNumber, emailId, userName, passWord);
        this.driverLicenceNumber = driverLicenceNo;
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
