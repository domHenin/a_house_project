package io.migenjutsu.project;

public class Owner {
    private String name;
    private int yearsOwn;
    private int numberOfHousesOwned;
    private double mortgage;
//    private double

//CONSTRUCTOR:
    public Owner(String name, int yearsOwn, int numberOfHousesOwned, double mortgage) {
        setName(name);
        setYearsOwn(yearsOwn);
        setNumberOfHousesOwned(numberOfHousesOwned);
        setMortgage(mortgage);
    }

//SETTERS:
    public void setName(String name) { this.name=name; }
    public void setYearsOwn(int yearsOwn) { this.yearsOwn = yearsOwn; }
    public void setNumberOfHousesOwned(int numberOfHousesOwned) { this.numberOfHousesOwned = numberOfHousesOwned; }
    public void setMortgage(double mortgage) { this.mortgage = mortgage; }

//GETTERS:
    public String getName() { return name; }
    public int getYearsOwn() { return yearsOwn; }
    public int getNumberOfHousesOwned() { return numberOfHousesOwned; }
    public double getMortgage() { return mortgage; }

//toString:
    @Override
    public String toString() {
        return "Owner{" +
                "name='" + name + '\'' +
                ", yearsOwn=" + yearsOwn +
                ", numberOfHousesOwned=" + numberOfHousesOwned +
                ", mortgage=" + mortgage +
                '}';
    }
}
