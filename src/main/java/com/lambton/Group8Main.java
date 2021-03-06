package com.lambton;

import java.beans.FeatureDescriptor;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Group8Main<b1> {
    public static void main(String[] args) {
        List<Vehicles> vehicleList = new ArrayList<Vehicles>();
        Group8Main v1 = new Group8Main();
        v1.insertOwnerDetails();



    }

    public void insertOwnerDetails() {
        LocalDate owner1BirthDate = LocalDate.of(1974, 10, 22);
        LocalDate owner2BirthDate = LocalDate.of(1969, 11, 10);
        LocalDate owner3BirthDate = LocalDate.of(1996, 7, 12);
        LocalDate owner4BirthDate = LocalDate.of(1994, 12, 21);
        LocalDate owner5BirthDate = LocalDate.of(1984, 1, 07);



        Owner owner1 = new Owner(1, "Caria", "MacNamee", Gender.Male, owner1BirthDate, "(463) 6723367",
                "cmacnamee0@imgur.com", "cmacnamee0", "kn4tCsv", "Eimbee", "(298) 9624526", "auda.org.au", null);

        Owner owner2 = new Owner(2, "Merrili", "Ellacott", Gender.Female, owner2BirthDate, "(441) 9258734",
                "kn4mellacott1@parallels.com", "mellacott1", "Rj7c6pjH", "Rooxo", "(772) 7884806", "tmall.com", null);

        Owner owner3 = new Owner(3, "Andre", "Elnough", Gender.Male, owner3BirthDate, "(319) 4690060",
                "aelnough2@dailymail.co.uk", "aelnough2", "iCwgJtjOnqsl", "Wikivu", "(551) 2776590", "nature.com",
                null);

        Owner owner4 = new Owner(4, "Kalindi", "Spensly", Gender.Female, owner4BirthDate, "(863) 2253855",
                "kspensly3@oaic.gov.au", "kspensly3", "5FWUMy", "Twitterbeat", "(912) 5937336", "macromedia.com", null);

        Owner owner5 = new Owner(5, "Eveline", "Lumox", Gender.Female, owner5BirthDate, "(721) 7650492", "elumox4@weather.com", "elumox4", "fwNXQKCkTVW", "Leenti", "(654) 4720600", "europa.eu", null);

        //inserting bus details//

        Bus b1 = new Bus("1N6AD0CU5BC296395", "Customer-focused bifurcated groupware", "Ford", "False", "Pepillo Kitman", "Yes", null
                , 9, FuelTypes.Petrol, 250f, 7f, "ScoolBus", BusAccessibility.Yes, WifiAccessibility.No);

        Bus b2 = new Bus("1GD01XEG5FZ726187", "Focused actuating help-desk", "Benz", "True", "Pepillo Kitman", "Yes",
                null, 26, FuelTypes.Diesel, 250f, 7f, "Coach", BusAccessibility.Yes, WifiAccessibility.Yes);
        Bus b3 = new Bus("3N1CN7AP4DL356756", "	Enhanced tertiary Graphical User Interface", "	Ford", "TRUE", null, "TRUE", "Intact Insurance", 30, FuelTypes.Diesel, 250f, 7f, "Double Decker", BusAccessibility.No, WifiAccessibility.Yes
        );
        Bus b4 = new Bus("1G4HC5EM9BU946298", "Devolved directional firmware", "Buick", "True", null, "Yes", "Jevco", 45, FuelTypes.Petrol, 250f, 7f, "Mini Bus", BusAccessibility.Yes, WifiAccessibility.Yes);
        Bus b5 = new Bus("WBAAV33461F067610", "Realigned object-oriented interface", "Nissan", "FALSE", "Krystle Wilbore", "Yes", "Aviva", 32, FuelTypes.Petrol, 250f, 7f, "Double-decker", BusAccessibility.Yes, WifiAccessibility.No);

        //inserting car details//

        Car c1 = new Car("WBA3A5C55CF202202", "Visionary optimal neural-net", "Scion", "False", "Pepillo  Kitman", "FALSE", null, 6, FuelTypes.Petrol, 100f, 5f, "tC", "Yellow");
        Car c2 = new Car("5N1CR2MNXEC181212", "Networked background initiative", "Ford", "TRUE", null, "TRUE", "Aviva", 8, FuelTypes.Diesel, 100f, 5f, "Econoline E150", "Violet");
        Car c3 = new Car("WAUUL98EX8A747315", "Reverse-engineered motivating moderator", "Buick", "FALSE", "Robb Seton", "TRUE", "Intact Insurance", 6, FuelTypes.Diesel, 100f, 5f, "Park Avenue", "Pink");
        Car c4 = new Car("ZHWGU5BZ0CL457896", "Multi-lateral content-based customer loyalty", "Ford", "TRUE", null, "False", null, 8, FuelTypes.Petrol, 100f, 5f, "Aerostar", "Mauv");
        Car c5 = new Car("WAU4FAFL0AA424617", "Persistent fault-tolerant focus group", "Suzuki", "TRUE", null, "FALSE", null, 7, FuelTypes.Petrol, 100f, 5f, "Esteem", "Crimson");

        //inserting  motorcycle details//

        MotorCycle m1 = new MotorCycle("WBA3B9C51DJ591682", "Right-sized 24/7 projection", "Harley Davidson", "True", "Pepillo  Kitman", "Yes", null, 2, FuelTypes.Petrol, 50f, 1f, 71, 41);
        MotorCycle m2 = new MotorCycle("WBAVB13506K975623", "Multi-lateral needs-based superstructure", "Ducati", "TRUE", null, "TRUE", "Aviva", 1, FuelTypes.Diesel, 50f, 1f, 59, 36);
        MotorCycle m3 = new MotorCycle("JH4DB76611S323929", "Multi-tiered context-sensitive projection", "BMW", "FALSE", "Krystle Wilbore", "FALSE", null, 2, FuelTypes.Diesel, 50f, 1f, 165, 23);
        MotorCycle m4 = new MotorCycle("5N1AR2MM1FC633287", "Secured local encryption", "Aprillia", "TRUE", null, "TRUE", "Intact Insurance", 1, FuelTypes.Petrol, 50f, 1f, 157, 32);
        MotorCycle m5 = new MotorCycle("3C6LD4AT1CG631333", "Seamless national benchmark", "Honda", "FALSE", "Pepillo  Kitman", "TRUE", "Aviva", 1, FuelTypes.Petrol, 50f, 1f, 183, 51);

        List<Vehicles> owner1VehicleList = new ArrayList<Vehicles>();
        owner1VehicleList.add(b1);
        owner1VehicleList.add(c2);
        owner1VehicleList.add(m3);

        List<Vehicles> owner2VehicleList = new ArrayList<Vehicles>();
        owner2VehicleList.add(b2);
        owner2VehicleList.add(c3);
        owner2VehicleList.add(m4);

        List<Vehicles> owner3VehicleList = new ArrayList<Vehicles>();
        owner3VehicleList.add(b3);
        owner3VehicleList.add(c4);
        owner3VehicleList.add(m5);

        List<Vehicles> owner4VehicleList = new ArrayList<Vehicles>();
        owner4VehicleList.add(b4);
        owner4VehicleList.add(c5);
        owner4VehicleList.add(m1);

        List<Vehicles> owner5VehicleList = new ArrayList<Vehicles>();
        owner5VehicleList.add(b5);
        owner5VehicleList.add(c1);
        owner5VehicleList.add(m2);


    }
}
