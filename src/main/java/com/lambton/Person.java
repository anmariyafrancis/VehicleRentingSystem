package com.lambton;

import java.time.LocalDate;

enum Gender
{
    MALE,
    FEMALE,
    OTHERS
}

public abstract class Person
{
    private int id;
    private String firstName;
    private String lastName;
    private Gender gender;
    private LocalDate birthDate;
    private int mobileNumber;
    private String emailId;
    private String userName;
    private String passWord;

    public Person(int id, String firstName, String lastName, Gender gender, LocalDate birthDate, int mobileNumber, String emailId, String userName, String passWord) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.birthDate = birthDate;
        this.mobileNumber = mobileNumber;
        this.emailId = emailId;
        this.userName = userName;
        this.passWord = passWord;
    }
}
