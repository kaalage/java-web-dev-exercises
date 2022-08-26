package org.launchcode.java.studios.restaurantmenu;

public class Restaurant {

    public static void main(String[] args) {
        MenuItem Bread = new MenuItem("Yummy Bread",10.25,"Delicious pasta","appetizer",false);
        MenuItem Pasta = new MenuItem("Yummy Pasta",10.25,"Delicious pasta","main course",false);
        MenuItem Cake = new MenuItem("Yummy Cake",10.25,"Delicious pasta","dessert",false);
        Menu menuForRestaurantA = new Menu();
        menuForRestaurantA.addMenuItem(Bread);
        menuForRestaurantA.addMenuItem(Pasta);
        menuForRestaurantA.addMenuItem(Pasta);
        menuForRestaurantA.addMenuItem(Cake);
        menuForRestaurantA.deleteMenuItem(Cake);
        System.out.println("Appetizers");
        for (MenuItem item: menuForRestaurantA.appetizers) {
            System.out.println(item.getName());
        }
        System.out.println("\nMain Courses");
        for (MenuItem item: menuForRestaurantA.mainCourses) {
            System.out.println(item.getName());
        }
        System.out.println("\nDesserts");
        for (MenuItem item: menuForRestaurantA.desserts) {
            System.out.println(item.getName());
        }
    }


}