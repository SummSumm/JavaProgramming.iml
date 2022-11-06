package day31_Constructors;

import java.util.ArrayList;
import java.util.Arrays;

public class pizzaObject {

    public static void main(String[] args) {
        // create 100 objects - small - cheese:2 - pepperoni: 3
        ArrayList <pizza> pizzas = new ArrayList<>();

        for (int i = 0; i < 100; i++) {
            pizza small = new pizza('S', 2, 3);
            pizza medium = new pizza('M', 3, 4);
            pizza large = new pizza('L', 4, 5);
            pizzas.addAll(Arrays.asList(small, medium,large));
        }
        System.out.println("Number of pizzas " + pizzas.size());


        double totalPrice = 0;
        for ( pizza each:pizzas ) {
            totalPrice+=each.calculateCost();
        }
        System.out.println("totalPrice = " + totalPrice);





    }

}
