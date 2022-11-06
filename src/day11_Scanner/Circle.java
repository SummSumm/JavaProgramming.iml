package day11_Scanner;

import java.util.Scanner;

public class Circle {
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the radius");

        double rad = scan.nextDouble();
        double area = rad*rad*3.14;
        double perimeter = rad*3.14*2;

        System.out.println("The area is "+ area);
        System.out.println("The perimeter is " + perimeter);

        scan.close();

    }
}

// enter radius --> perimeter and area