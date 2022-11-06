package day21_Array_For_Each;

import java.util.Arrays;

public class ShoppingList {
    public static void main(String[] args) {

        String [] items = {"Shoes", "Jacket", "Gloves", "AirPods", "iPad", "Case"};
        double [] prices = {99.99, 150.0, 9.99, 250, 439.50, 39.99};
        int [] ID = {12345,12346,12347,1248,12349,12350};

        System.out.println("ITEM" +"\t" + "PRICE" +"\t" + "ID");

        for (int i = 0; i < items.length; i++) {
            String item = items[i];
            double price = prices [i];
            int IDeach = ID[i];

            System.out.println(item + "\t" + price + "\t" + IDeach);
        }
    }
}
