import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        Menu menu = new Menu();
        menu.addDish(new Dish("Pizza", 8.99));
        menu.addDish(new Dish("Burger", 5.99));
        menu.addDish(new Dish("Salad", 4.99));

        // Sorting using Comparable
        Collections.sort((List<Dish>) menu);
        System.out.println("Sorted Menu:");
        for (Dish dish : menu) {
            System.out.println(dish);
        }

        // Cloning a dish
        Dish originalDish = new Dish("Pasta", 7.99);
        Dish clonedDish = originalDish.clone();
        System.out.println("Original: " + originalDish);
        System.out.println("Cloned: " + clonedDish);
    }
}
