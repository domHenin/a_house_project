package io.migenjutsu.project;

public class App {
    public static void main(String[] args) {
//        System.out.println("Hello World!");

        House house = new House(14250,207, 4, 250000, 1300, "Lindo", "Ron");
        Owner owner = new Owner("John Doe", 10, 3, 1030);

        System.out.println(house.toString());
//        owner.toString();



    }



}
