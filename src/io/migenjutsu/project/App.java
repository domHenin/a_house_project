package io.migenjutsu.project;

public class App {
    public static void main(String[] args) {

        House house = new House(14250,207, 4, 250000, 1300, "Marigold", "Don");
        Owner owner = new Owner("John Doe", 10, 3, 1030);
        Tenant tenant = new Tenant("James Rogers", 3, 1);

        System.out.println();

//TEST::
        System.out.println(house.toString());
        System.out.println(owner.toString());
        System.out.println(tenant.toString());

        int a;

        for (int i=0; i<house.getPeopleLivingAge().length; i++) {

        }

        a= house.getPeopleLivingAge()[0];
        a=house.getPeopleLivingAge()[1];
        a=house.getPeopleLivingAge()[2];

        System.out.println(a);
    }
}
//TODO:
// iterate through the array to print all

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
