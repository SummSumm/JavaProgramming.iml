package day17_While_Do;
import java.util.Scanner;
public class infiniteSum {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter number");
        int num1 = scan.nextInt();

        int sum= 0;

        while (num1>0) {
             sum += num1;
            System.out.println("Enter number");
             num1 = scan.nextInt();
           if(num1<0){
               break;
           }
        }
        System.out.println("Sum is: " + sum);
        System.out.println("----------------");



        int result=0;
        int summ = 0;
        int division =0;
        int subt =0;
        int mult = 0;


            while(true) {
            System.out.println("enter a number");
            int no= scan.nextInt();
            System.out.println("enter an operator");
            char op = scan.next().charAt(0);
            System.out.println("Enter another number");
            int no2= scan.nextInt();

             if (op=='+') {
                summ=no+no2;
                result =summ;
            } else if (op=='-') {
                subt = no-no2;
                result = subt;
            } else if (op=='/') {
                division = no/no2;
                result=division;
            } else if (op=='*') {
                mult =no*no2;
                result =mult;
            } else  {
                System.out.println("invalid");
                break;
            }
            System.out.println("result = " + result);
            System.out.println("Let's try again");
        }






scan.close();

    }
}
