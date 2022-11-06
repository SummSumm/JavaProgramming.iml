package day12_String;

import java.util.Scanner;

public class StringMethodsChar {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your first name");
        String first = input.next();

        System.out.println("Enter your last name");
        String last = input.next();

        char f = first.charAt(0);
        char l = last.charAt(0);

        System.out.println("Your initials are " + f + "." + l + ".");
        System.out.println("-------------------------------------------------------------------");

        //let's get the third character:

        System.out.println("Enter your mother's maiden surname");
        String mms = input.next();

        char maiden = mms.charAt(2);
        System.out.println("the third letter of your mother's maiden surname is " + maiden);

        input.close();

    }
}
