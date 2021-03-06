package com.lambton;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Owner extends Person
{
    private String companyTitle;
    private String businessLandLineNumber;
    private String website;
    private List<String> list=new ArrayList<String>();

    public Owner(int id, String firstName, String lastName, Gender gender, LocalDate birthDate, String mobileNumber, String emailId, String userName, String passWord, String companyTitle, String businessLandLineNumber, String website, String vehicleListOwned)
    {
        super(id, firstName, lastName, gender, birthDate, mobileNumber, emailId, userName, passWord);
        this.companyTitle = companyTitle;
        this.businessLandLineNumber = businessLandLineNumber;
        this.website = website;
        //this.vehicleListOwned = vehicleListOwned;
    }

    public String getCompanyTitle() {
        return companyTitle;
    }

    public void setCompanyTitle(String companyTitle) {
        this.companyTitle = companyTitle;
    }

    public String getBusinessLandLineNumber() {
        return businessLandLineNumber;
    }

    public void setBusinessLandLineNumber(String businessLandLineNumber) {
        this.businessLandLineNumber = businessLandLineNumber;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    public List<String> getList() {
        return list;
    }

    public void setList(List<String> list) {
        this.list = list;
    }

    @Override
    public void print()
    {
        System.out.println("Company title: " + getCompanyTitle());
        System.out.println("Company Contact Number: " + getBusinessLandLineNumber());
        System.out.println("Company Website: " + getWebsite());
        //System.out.println("Vehicle List Owned: " + getVehicleListOwned());
    }
}
