package day03_EscapeSequences;

public class GasReceipt {
    public static void main(String[] args) {
        System.out.println("");
        System.out.println("    MCLEAN STORE");
        System.out.println("");
        System.out.println("2021-09-20   09:25PM");
        System.out.println("");
        System.out.println("Gallons:    11.840");
        System.out.println("Price/gallon: $ 2.089");
        System.out.println("");
        System.out.println("Fuel Total:  $ 24.734");




        boolean X = true;
        boolean Y = !X == false;
        boolean Z = Y;

        if (X) {
            System.out.println("1");
        }
        if (Y) {
            System.out.println("2");
        }if (Z){
            System.out.println("3");
        }

        int x=10;
        int y= x++;
        System.out.println(x + y);
    }



}
