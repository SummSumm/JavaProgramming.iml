package Week04;

import org.w3c.dom.ls.LSOutput;

public class SwitchPrice {
    public static void main(String[] args) {
        System.out.println("WELCOME TO ADAIRE APARTMENTS");

        int numberofBedrooms= 1;
        int startingPrice= 0;

       switch (numberofBedrooms){
           case 0:
               System.out.println("You have selected a STUDIO apartment");
               startingPrice = 1454;
               break;
           case 1:
               System.out.println("You have selected a ONE bedroom apartment");
               startingPrice=1725;
               break;
           case 2:
               System.out.println("You have selected a TWO bedroom apartment");
               startingPrice = 2899;
               break;
           default:
               System.out.println("Invalid number of rooms");
               break;
       }
        System.out.println("Price = $" + startingPrice);
    }
}
