package day18_NestedLoop;
import java.util.Scanner;
public class calculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double result = 0;

        System.out.println("enter a number");
        double num1 = scan.nextDouble();

        System.out.println( "Enter an operator");
        String op = scan.next();

        while(!(op.equals("+") || op.equals("-") || op.equals("*") || op.equals("/"))) {
            System.out.println("Wrong operator, please re-enter");
            op = scan.next();
        }

        System.out.println("enter another number");
        double num2 = scan.nextDouble();
        System.out.println("");

        if (op.equals("+")) {
            result = num1+num2;
        } else if (op.equals("-")) {
            result = num1-num2;
        } else if (op.equals("*")) {
            result = num1*num2;
        } else {
            result= num1/num2;
        }
        System.out.println(result);
    }
}
