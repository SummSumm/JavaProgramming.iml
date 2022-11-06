
package day17_WhilLoops;
import java.util.Scanner;
public class Calculator {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("enter your first number");
        int num1 = input.nextInt();
        System.out.println("enter your second number");
        int num2 = input.nextInt();

        System.out.println("enter ya math operator");
        char oper = input.next().charAt(0);

        /*if (!(oper=='+' || oper =='-')) { // --> let's use while istead of while down
            System.err.println("Invalid character");
        }
        System.out.println((oper=='+')? num1+num2 :  num1-num2);

        System.out.println("----------------------------");
        */

        while (!(oper=='+' || oper =='-')) { // it will keep running as long as hte wrong char is given
            // when teh correct one is given --> false and stops
            System.err.println("Invalid character, re-enter operator");
            oper = input.next().charAt(0);
        }
        System.out.println((oper=='+')? num1+num2 :  num1-num2);

        input.close();
    }
}
