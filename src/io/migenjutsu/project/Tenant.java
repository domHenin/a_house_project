package io.migenjutsu.project;
// think of more attributes.
public class Tenant {
    private String name;
//    private int numberInFamily;
//    private int contractLength;

//CONSTRUCTOR:
    public Tenant(String name) {
        setName(name);
//        setNumberInFamily(numberInFamily);
//        setContractLength(contractLength);
    }

//SETTERS:
    public void setName(String name) { this.name = name; }
//    public void setNumberInFamily(int numberInFamily) { this.numberInFamily = numberInFamily; }
//    public void setContractLength(int contractLength) { this.contractLength = contractLength; }

//GETTERS:
    public String getName() { return name; }
//    public int getNumberInFamily() { return numberInFamily; }
//    public int getContractLength() { return contractLength; }

//toString:
    @Override
    public String toString() {
        return "Tenant{" +
                "name='" + name + '\'' +
                '}';
    }
}
