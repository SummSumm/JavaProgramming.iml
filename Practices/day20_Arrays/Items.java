package day20_Arrays;

import java.util.Arrays;

public class Items {
    public static void main(String[] args) {
        String[] items  = {"Shoes", "Jacket",  "Gloves", "AirPods", "iPad", "iPhone 12 case" };
        double[] prices = {99.99,      150.0,  9.99,     250.0 ,    439.50,  39.99};
        int[] itemIDs =   {12345 ,     12346,  12347,    12348,     12349,    12350};
        String each = "";


        for (int i = 0; i < items.length; i++) {
             each = items[i];

             if (each.contains("Gloves")){
                 System.out.println(i);
             }

        }

        if (each.contains("iPad"));
        {
            System.out.println("We have iPad");
        }

        System.out.println("NAME" + "\t" + "\t"  + "PRICE" + "\t" + "\t" +"ID");
        for (int i = 0; i < items.length; i++) {
            String item = items[i];
            double price = prices[i];
            int ID = itemIDs [i];

            System.out.println(item + "\t" + "\t"  + price + "\t" + "\t" +ID);


        }
        //int value=30;
        String s1=String.valueOf(30);
        System.out.println(s1+10);//concatenating string with 10

    }


}
/*
3. Given the following arrays:
        String[] items  = {"Shoes", "Jacket",  "Gloves", "AirPods", "iPad", "iPhone 12 case" };
        double[] prices = {99.99,      150.0,  9.99,     250.0 ,    439.50,  39.99};
        int[] itemIDs =   {12345 ,     12346,  12347,    12348,     12349,    12350};


        1. find out the first index number of "Gloves"

        2. find out if "iPad" is contained in the item list

        3. Print the report of each shopping item
            name - price - #ID

 */