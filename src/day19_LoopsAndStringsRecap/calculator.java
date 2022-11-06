package day19_LoopsAndStringsRecap;
import java.util.Scanner;
public class calculator {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

       while (true) {
           System.out.println("Enter a number");
           double num1 = scan.nextDouble();

           System.out.println("Enter an operator");
           char op = scan.next().charAt(0);


           if (!(op == '+' || op == '-')) {
               System.out.println("Invalid operator");
               System.exit(0);
           } else {
               System.out.println("Enter another number");
               double num2 = scan.nextDouble();

               if (op=='+') {
                   System.out.println(num1+num2);
               } else {
                   System.out.println(num1-num2);
               }}


           System.out.println("Would you like to enter new numbers?");
           String answer = scan.next();
           if (answer.equalsIgnoreCase("no")) {
               System.out.println("Thank you!");
               System.exit(0);
           }
       }


        //sadece + ve - ile
    }
}
