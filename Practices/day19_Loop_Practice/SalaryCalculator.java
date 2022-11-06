package day19_Loop_Practice;
import java.util.Scanner;
public class SalaryCalculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        while(true) {

        System.out.println("How much do you make an hour");
        double hourlyRate = scan.nextDouble();

        if (hourlyRate<=0) {
            System.err.println("INVALID");
            System.exit(0);
        }
        System.out.println("How many hours do you work each week?");
        int hours = scan.nextInt();

        if (hours<1 || hours>144) {
            System.err.println("INVALID");
            System.exit(0);
        }

        System.out.println("Enter state tax rate");
        double tax = scan.nextDouble();

        if (tax<1 || tax>10) {
            System.err.println("INVALID");
            System.exit(0);
        }

        double fed = hourlyRate*hours*52;
        double fedtax = fed*0.26;
        double state = fed*(tax/100);
        System.out.println("Gross Salary is: " + fed);
        System.out.println("Federal tax is: " + fedtax);
        System.out.println("State tax is: " + state);
        System.out.println("Total tax is: " + (fedtax + state));
        System.out.println("Net income is: " + (fed-(fedtax+state)));
            System.out.println(" ");

        System.out.println("Would you like to continue?");
        String ans = scan.next();
        while (!((ans.equalsIgnoreCase("yes")) || (ans.equalsIgnoreCase("no")))) {
            System.err.println("Invalid. Please try again");
            ans= scan.next();
        }

        if (ans.equalsIgnoreCase("no")) {
            System.err.println("OK, whatever");
            System.exit(0);
        }

    }



    }
}


/*
5. Write a program for the salary calculator
			1. Ask the user "How much you make an hour?"
					If user entered hourlyRate is 0 or negative, terminate the program after displaying the error message "Invalid Entry for Hourly Rate"

			2. Ask the user  "How many hours do you work per week?"
					if user entered weeklyHour is less than 1 or greater than 144, terminate the program after displaying the error message "Invalid Entry for Weekly Hours"

			3. Ask the user  "Enter your state tax rate"
					if the state tax rate is less than 0% or greater than 10%, terminate the program after displaying the error message "Invalid Entry for state tax Rate"


			4. Display:
					1. Gross Salary
					2. Federal Tax (assume that federal tax rate is 26%)
					3. State Tax
					4. Total Tax
					5. Net Income

			5. Ask the user "Would you like to continue?"
				If "yes" --> repeat all the previous steps
				If "no" --> print "Thank you for using Cydeo Salary Calculator APP"

				If user enters an invalid entry, terminate the program after displaying the error message "Invalid Entry"
 */