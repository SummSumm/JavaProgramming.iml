package day08_IfStatements;

public class IfStatements {
    public static void main(String[] args) {


        int number = 300;

        boolean oddnumber = number % 2 == 1;


        if (oddnumber) {
            System.out.println(number + " is an Odd Number.");
        }
        ;
        if (!oddnumber) {
            System.out.println(number + " is an Even Number.");
        }
        ;

        System.out.println("-------------------------------------------------------------------------");

        int num2 = 3;

        boolean positive = num2 > 0;
        boolean negative = num2 < 0;
        boolean zero = num2 == 0;

        if (positive) {
            System.out.println(num2 + " is a positive number.");
            if (negative) {
                System.out.println(num2 + " is a negative number.");
                if (zero) {
                    System.out.println(num2 + " is equal to Zero.");
                }
                ;
            };

        }
        ;
        System.out.println("------------------------------------------------------------------");

        int n = 8;
        if(n>0) {
            System.out.println(n + " is a positive number.");
        };
        if (n<0){
            System.out.println(n + " is a negative number.");
        };
        if (n==0) {
            System.out.println(n + " is equal to 0.");
        };
    }
}
/*
Single If
multi-branch if
nested if



 */