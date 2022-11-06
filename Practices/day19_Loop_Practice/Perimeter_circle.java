package day19_Loop_Practice;
import java.util.Scanner;
public class Perimeter_circle {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        while (true) {
            System.out.println("enter the radius");
            double r = scan.nextDouble();
            System.out.println("");

            if (r <= 0) {
                System.err.println("How is this even possible?");
                System.exit(0);
            } else {
                System.out.println("Diameter is: " + r * 2);
                System.out.println("Perimeter is: " + r * 2 * 3.14);
                System.out.println("Area is: " + r * r * 3.14);
            }
            System.out.println("Would you like to calculate another circle?");
            String answer = scan.next();

            while (!(answer.equalsIgnoreCase("yes"))) {
                if (answer.equalsIgnoreCase("no")) {
                    System.exit(0);
                } else {
                    System.out.println("Wrong. Please re-enter");
                    answer = scan.next();
                }
            }
        }

    }
}


/*
	1. Write a program that can calculate the area and perimeter of a circle:
			1. Ask the user "Enter the radius of the circle:"
				if user enters 0 or negative numbers, terminate the program after displaying the error message "Invalid Entry for the radius of the circle"

			2. Display:
					1. Diameter of circle
					2. Area of circle
					3. Perimeter of circle

			3. Ask the user "Would you like to calculate another circle?"
					If "yes" --> repeat the previous steps
					If "No" --> Print "Thank you for using Cydeo Circle Calculator APP"

				If user enters an invalid entry, ask the user to re-enter until user provides a valid entry
 */