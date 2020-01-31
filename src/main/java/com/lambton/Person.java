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
    int id;
    String firstName;
    String lastName;
    Gender gender;
    LocalDate birthDate;
    int mobileNumber;
    String emailId;
    String userName;
    String passWord;
}
