package day05_StringConcatenation;

public class FullName {

    public static void main(String[] args) {
        String firstName = "Sumeyye";
        String lastName = "Aslan";
        int age = 34;

        String fullname = "Hi, my name is " + firstName + ", and my last name is " + lastName + ".";
        System.out.println("fullname = " + fullname);

        String sentence = firstName + " is " + age + " years old.";
        System.out.println("sentence = " + sentence);
        System.out.println("The full name of the person is " + firstName + ", and their age is " + age);


        System.out.println(firstName + " is " + age + " years old.");
        /* cumle için tekrar stringe gerek yok; variableları girip
        soutv ile ekleyerek gelebilirsin.
         */

        String jobTitle = "SDET";
        String company = "Apple Inc.";
        System.out.println(firstName + " is an " + jobTitle + " at " + company + " and she earns A LOT.");
    }
}


/*
1. Create a class called FullName.java
2. Declare the following variables:
1. firstName
2. lastName
3. Use concatenation to print the full address
 */