package day19_Loop_Practice;
import java.util.Scanner;
public class Perimeter_Square {
    public static void main(String[] args) {
Scanner scan = new Scanner(System.in);
        while (true) {
            System.out.println("Enter side");
        double side = scan.nextDouble();


            while (side <= 0) {
                System.err.println("Impossible");
                System.exit(0);
            }
            double perimeter = side * 4;
            double area = side * side;
            System.out.println("perimeter is: " + perimeter);
            System.out.println("area is: " + area);

            System.out.println("Would you like to calculate another square?");
            String answer = scan.next();

            while (!(answer.equalsIgnoreCase("yes")) || (answer.equalsIgnoreCase("no"))) {
                System.err.println("Invalid. Try again");
                answer = scan.next();

            }

            if (answer.equalsIgnoreCase("no")) {
                System.out.println("Thank you for using Cydeo Calculator.Bye!");
                System.exit(0);
            }


        }


    }
}
/*
2. Write a program that can calculate the area and perimeter of a Square:
			1. Ask the user "Enter the side of the square:"
				if user enters 0 or negative numbers, terminate the program after displaying the error message "Invalid Entry for the side of the square"

			2. Display:
					1. Area of square
					2. Perimeter of square

			3. Ask the user "Would you like to calculate another Square?"
					If "yes" --> repeat the previous steps
					If "No" --> Print "Thank you for using Cydeo Square Calculator APP"

				If user enters an invalid entry, ask the user to re-enter until user provides a valid entry

 */