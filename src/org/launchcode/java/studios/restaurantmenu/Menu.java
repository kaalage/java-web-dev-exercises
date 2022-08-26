package org.launchcode.java.studios.restaurantmenu;

import java.util.ArrayList;

public class Menu {

    public ArrayList<MenuItem> appetizers = new ArrayList<>();

    public ArrayList<MenuItem> mainCourses = new ArrayList<>();

    public ArrayList<MenuItem> desserts = new ArrayList<>();

    public void addMenuItem(MenuItem item) {
        if (appetizers.contains(item) || mainCourses.contains(item) || desserts.contains(item)){
            System.out.println("This item is already on the menu!");
            //break;
        } else if(item.getCategory().equals("appetizer")) {
            this.appetizers.add(item);
        } else if (item.getCategory().equals("main course")) {
            this.mainCourses.add(item);
        } else if (item.getCategory().equals("dessert")) {
            this.desserts.add(item);
        }
    }

    public void deleteMenuItem(MenuItem item) {
        if (item.getCategory().equals("appetizer")) {
            this.appetizers.remove(item);
        } else if (item.getCategory().equals("main course")) {
            this.mainCourses.remove(item);
        } else if (item.getCategory().equals("dessert")) {
            this.desserts.remove(item);
        }
    }

}
