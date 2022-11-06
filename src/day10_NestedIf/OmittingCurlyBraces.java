package day10_NestedIf;

public class OmittingCurlyBraces {
    public static void main(String[] args) {

        //if the if statement has only one statement, then you may omit curlies
        int n=7;

        if(n==1)
            System.out.println("Monday");
        else if(n==2)
            System.out.println("Tuesday");
        else if (n==3)
            System.out.println("Wednesday");
        else if (n==4)
            System.out.println("Thursday");
        else if (n==5)
            System.out.println("Friday");
        else if (n==6)
            System.out.println("Saturday");
        else
            System.out.println("Sunday");
        }
    }

