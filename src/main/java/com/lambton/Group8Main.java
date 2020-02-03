package com.lambton;

import java.time.LocalDate;

public class Group8Main
{
    public static void main(String[] args)
    {
        Group8Main v1=new Group8Main();
        v1.insertOwnerDetails();
    }
    public void insertOwnerDetails()
    {
        LocalDate owner1BirthDate=LocalDate.of(1974,10,22);
        LocalDate owner2BirthDate=LocalDate.of(1969,11,10);
        LocalDate owner3BirthDate=LocalDate.of(1996,7,12);
        LocalDate owner4BirthDate=LocalDate.of(1994,12,21);
        LocalDate owner5BirthDate=LocalDate.of(1984,1,07);

        Owner owner1 = new Owner(1, "Caria", "MacNamee",Gender.Male,owner1BirthDate, "(463) 6723367",
                "cmacnamee0@imgur.com", "cmacnamee0", "kn4tCsv", "Eimbee", "(298) 9624526", "auda.org.au", null);

        Owner owner2 = new Owner(2, "Merrili", "Ellacott",Gender.Female,owner2BirthDate, "(441) 9258734",
                "kn4mellacott1@parallels.com", "mellacott1", "Rj7c6pjH", "Rooxo", "(772) 7884806", "tmall.com", null);

        Owner owner3 = new  Owner(3, "Andre", "Elnough",Gender.Male,owner3BirthDate, "(319) 4690060",
                "aelnough2@dailymail.co.uk", "aelnough2", "iCwgJtjOnqsl", "Wikivu", "(551) 2776590", "nature.com",
                null);

        Owner owner4 = new Owner(4, "Kalindi", "Spensly",Gender.Female,owner4BirthDate , "(863) 2253855",
                "kspensly3@oaic.gov.au", "kspensly3", "5FWUMy", "Twitterbeat", "(912) 5937336", "macromedia.com", null);

        Owner owner5 = new Owner(5,"Eveline","Lumox",Gender.Female,owner5BirthDate,"(721) 7650492","elumox4@weather.com","elumox4","fwNXQKCkTVW","Leenti","(654) 4720600","europa.eu",null);
    }
}
