package com.lambton;

import java.time.LocalDate;

public class Owner extends Person
{
    private String companyTitle;
    private int businessLandLineNo;
    private String website;
    private String vehicleListOwned;

    public Owner(int id, String firstName, String lastName, Gender gender, LocalDate birthDate, int mobileNumber, String emailId, String userName, String passWord, String companyTitle, int businessLandLineNo, String website, String vehicleListOwned) {
        super(id, firstName, lastName, gender, birthDate, mobileNumber, emailId, userName, passWord);
        this.companyTitle = companyTitle;
        this.businessLandLineNo = businessLandLineNo;
        this.website = website;
        this.vehicleListOwned = vehicleListOwned;
    }
}
