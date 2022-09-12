package org.launchcode.java.demos.lsn7interfaces;

import java.util.ArrayList;
import java.util.Comparator;

public class Main {
    public static void main(String[] args){
        Case menu = new Case();
        ArrayList<Flavor> flavors = menu.getFlavors();
        ArrayList<Cone> cones = menu.getCones();
        ArrayList<Topping> toppings = menu.getToppings();


        // TODO: Use a Comparator class to sort the 'flavors' array alphabetically by the 'name'
        //  field.

        Comparator comparator = new FlavorComparator();

        for (Flavor flavor : flavors) {
            System.out.println(flavor);
        }

        flavors.sort(comparator);
        System.out.println("*************\n");


        for (Flavor flavor : flavors) {
            System.out.println(flavor);
        }

        System.out.println("*************\n");

        // TODO: Use a Comparator class to sort the 'cones' array in increasing order by the 'cost'
        //  field.
        Comparator comparator2 = new ConeComparator();

        for (Cone cone : cones) {
            System.out.println(cone);
        }

        cones.sort(comparator2);
        System.out.println("*************\n");


        for (Cone cone : cones) {
            System.out.println(cone);
        }



        // TODO: Print the 'flavors' and 'cones' lists (in a clear manner) to verify the sorting.
        System.out.println(toppings);


    }
}
