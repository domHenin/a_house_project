package io.migenjutsu.project;

import java.util.HashMap;

public class App {
    public static void main(String[] args) {

        House house = new House(14250,207, 4, 250000, 1300, "Marigold", "Don");
        Owner owner = new Owner("John Doe", 10, 3, 1030);
        Tenant tenant = new Tenant("James Rogers");
        YearlyIncome yearlyIncome = new YearlyIncome("James Rogers", 2000);

        System.out.println();

//TEST::
        System.out.println(house.toString());
        System.out.println(owner.toString());
        System.out.println(tenant.toString());

        System.out.println();

//ARRAY ATTEMPT:
        int ages;

        for (int i=0; i<house.getPeopleLivingAge().length; i++) {
            ages=house.getPeopleLivingAge()[i];

            System.out.println("Tenants age: "+ages);
        }

        System.out.println();

        String names;

        for (int i=0; i<house.getPeopleLivingName().length; i++) {
            names=house.getPeopleLivingName()[i];

            System.out.println("Tenants name: "+names);
        }

        System.out.println();

//HASHMAP ATTEMPT:
        HashMap<Integer, String> newHashMap = house.getHashMap();

        System.out.println(newHashMap);

        System.out.println();

//YearlyIncome()
        System.out.println(yearlyIncome.toString());;

    }
}
//TODO:
// start thinking of objects that can inherit from created objects

//CODE GRAVEYARD::
// ***    CALL ARRAY ATTEMPT ***
//        house.getPeopleLiving().clone();
//int[] newArray = house.getPeopleLivingAge();
//
//        System.out.println(newArray);
//
//        System.out.println();
//
//                System.out.println(newArray);
//
//        for (int i=0; i<newArray.length; i++) {
//            System.out.println(i+" "+newArray);
//        }
