package day17_While_Do;
import java.util.Scanner;
public class InsuranceQuote {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double price = 0;
        System.out.println("Enter your name");
        String name = scan.nextLine();

        System.out.println("Enter your gender");
        String gender = scan.nextLine();

        while (!(gender.equalsIgnoreCase("male") || gender.equalsIgnoreCase("female"))) {
            System.out.println("Invalid please enter again");
            gender = scan.next().toLowerCase();
        }
        System.out.println("Are you married?");
        String married = scan.next().toLowerCase();

        while (!(married.equalsIgnoreCase("yes") || married.equalsIgnoreCase("no"))) {
            System.out.println("Invalid please enter again");
            married = scan.next().toLowerCase();
        }

        System.out.println("Enter age");
        int age = scan.nextInt();

        while (age < 0 || age > 120) {
            System.out.println("Invalid age please re-enter");
            age = scan.nextInt();
        }

        System.out.println("how many miles?");
        double miles = scan.nextDouble();

        while (miles < 5) {
            System.out.println("Invalid entry please re-enter");
            miles = scan.nextDouble();
            System.out.println();
        }

        System.out.println("Full coverage or liability?");
        String full = scan.next();

        System.out.println("Any accidents in the past 5 years?");
        String accident = scan.next();
        while (!(accident.equalsIgnoreCase("yes") || accident.equalsIgnoreCase("no"))) {
            System.out.println("Invalid please enter again");
            accident = scan.next().toLowerCase();
        }
        System.out.println("Any anti-theft device?");
        String anti = scan.next();
        while (!(anti.equalsIgnoreCase("yes") || anti.equalsIgnoreCase("no"))) {
            System.out.println("Invalid please enter again");
            anti = scan.next().toLowerCase();
        }


        if (full.equalsIgnoreCase("liability")) {

            if (age < 25) {
                price += 90;
            } else {
                price += 50;
            }


            if (miles <= 10) {
                price += 10;
            } else if (miles > 10 && miles <= 50) {
                price += 30;
            } else {
                price += 50;
            }

        } else if (full.equalsIgnoreCase("full")) {
            if (age < 25) {
                price += 160;
            } else {
                price += 120;
            }


            if (miles <= 10) {
                price += 20;
            } else if (miles > 10 && miles <= 50) {
                price += 40;
            } else {
                price += 70;

            }

            if (anti.equalsIgnoreCase("yes")) {
                price -= (price*0.05);
            }

            if (accident.equalsIgnoreCase("yes")) {
                price+= (price*0.15);
            } else {
                price -= (price*0.1);
            }

            if (married.equalsIgnoreCase("yes")) {
                price-= price*0.05;
            }

        }

        System.out.println(price);
        scan.close();
    }
}

//			    If he/she never had any accidents or claims in past 5 years ==> 10% discount
//			    If he/she is married ==> 5% discount