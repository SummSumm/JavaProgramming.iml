package day16_For_String;
import java.util.Scanner;
public class CountOfPosNeg {
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        System.out.println("Enter 5 numbers");
        int pres = 0;
        int nres = 0;
        for (int i = 0; i < 5; i++) {
            int num = scan.nextInt();

            if (num<0) {
                nres ++;
            }else if (num>0) {
                pres++;
            }

        } System.out.println( "negative numbers: " + nres);
        System.out.println("positive numbers: " + pres);
        scan.close();


    }
}

