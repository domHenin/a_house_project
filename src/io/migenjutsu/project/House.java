package io.migenjutsu.project;

import java.util.HashMap;

public class House {
    private int squareFeet;
    private int houseNumber;
    private int numberRooms;
    private double costOfHouse;
    private double costToRent;
    private String streetName;
    private String propManager;

    private int[] peopleLivingAge = { 30, 28, 7 };
    private String[] peopleLivingName = { "James Rogers", "Jane Rogers", "Cindy Rogers" };

    private HashMap<Integer, String> hashMap = new HashMap<>();

//CONSTRUCTOR:
    public House(int squareFeet, int houseNumber, int numberRooms, double costOfHouse, double costToRent, String streetName, String propManager) {
        setSquareFeet(squareFeet);
        setHouseNumber(houseNumber);
        setNumberRooms(numberRooms);
        setCostOfHouse(costOfHouse);
        setCostToRent(costToRent);
        setStreetName(streetName);
        setPropManager(propManager);

        hashMap.put(1, "James Rogers");
        hashMap.put(2, "Jane Rogers");
        hashMap.put(3, "Cindy Rogers");
    }

//SETTERS:
    public void setSquareFeet(int squareFeet) { this.squareFeet=squareFeet; }
    public void setHouseNumber(int houseNumber) { this.houseNumber=houseNumber; }
    public void setNumberRooms(int numberRooms) { this.numberRooms=numberRooms; }
    public void setCostOfHouse(double costOfHouse) { this.costOfHouse=costOfHouse; }
    public void setCostToRent(double costToRent) { this.costToRent=costToRent; }
    public void setStreetName(String streetName) { this.streetName=streetName; }
    public void setPropManager(String propManager) { this.propManager=propManager; }
//  public void setPeopleLivingAge(int[] peopleLiving) { this.peopleLivingAge = peopleLivingAge; }


//GETTERS:
    public int getSquareFeet() { return squareFeet; }
    public int getHouseNumber() { return houseNumber; }
    public int getNumberRooms() { return numberRooms; }
    public double getCostOfHouse() { return costOfHouse; }
    public double getCostToRent() { return costToRent; }
    public String getStreetName() { return streetName; }
    public String getPropManager() { return propManager; }
    public int[] getPeopleLivingAge() { return peopleLivingAge.clone(); }
    public String[] getPeopleLivingName() { return peopleLivingName.clone(); }

    public HashMap<Integer, String> getHashMap() {
        return hashMap;
    }

//toString:
    @Override
    public String toString() {
        return "House{" +
                "squareFeet=" + squareFeet +
                ", houseNumber=" + houseNumber +
                ", numberRooms=" + numberRooms +
                ", streetName='" + streetName + '\'' +
                ", propManager='" + propManager + '\'' +
                '}';
    }
}
