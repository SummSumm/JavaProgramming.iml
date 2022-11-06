package day17_WhilLoops;

import java.sql.SQLOutput;

public class DoWhile {
    public static void main(String[] args) {
        //BREAK

        for ( char i = 'A'; i <= 'Z' ; i++) {
            if (i =='F') { // Fi basmayacak
                break;
            }
            System.out.println(i + " ");


        }

        System.out.println("--------------------------");
        int num = 1;
        while (true) {
            System.out.println("Enter a number");
            num++;
             if (num>10) {
                 break;
             }
        }
    }
}
