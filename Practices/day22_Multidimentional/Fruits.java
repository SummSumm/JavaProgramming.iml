package day22_Multidimentional;

import java.util.Arrays;

public class Fruits {
    public static void main(String[] args) {
        String[][] items = {
                {"Apple", "Banana", "Grape", "Avocado"},
                {"Paper Towels", "Toilet Papers", "Tissues", "Diapers"},
                {"Coke", "Fanta", "Arizona Tea", "Pepsi", "Water"}
        };

        for (String[] item : items) {
            Arrays.toString(item);
            for (String s : item) {
                System.out.print(s + " ");
            }
            System.out.println();
        }
        System.out.println("------------------------------------------");
        for (String[] each : items) {
            for (int i = each.length-1; i >=0 ; i--) {
                System.out.print(each[i] + "\t");
            }
            System.out.println();
        }
        System.out.println("------------------------------------------");
        for (int i = items.length-1; i >=0 ; i--) {
           String [] eachh = items[i];
            for (int j = 0; j <eachh.length ; j++) {
                System.out.print(eachh[j] + "\t");

            }
            System.out.println();
        }
    }

}
/*
		1. print the following output: (add \t between two words)
				Apple    Banana   Grape    Avocado
				Paper Towels     Toilet Papers   Tissues    Diapers
				Coke   Fanta   Arizona Tea   Pepsi   Water

		2. print the following output: (add \t between two words)
				Avocado   Grape    Banana    Apple
				Diapers   Tissues   Toilet Papers   Paper Towels
				Water    Pepsi    Arizona Tea    Fanta   Coke

		3. print the following output: (add \t between two words)
				Coke   Fanta   Arizona Tea   Pepsi   Water
				Paper Towels     Toilet Papers   Tissues    Diapers
				Apple    Banana   Grape    Avocado
 */