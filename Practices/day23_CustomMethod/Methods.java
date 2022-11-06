package day23_CustomMethod;

import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;

public class Methods {
    public static void main(String[] args) {
        odds();
        System.out.println();
        evens();
        System.out.println();
        eligibleAlcohol();
        vote(31, "USA");
        grade(75);
        circle(6);
        square(8);
        dollarEuro(10);
        dollarTL(10);
        kglb(2);
        posnegzero(0);
        eachString("Ayse");
        System.out.println();
        eachElement();
        System.out.println();
        name("SumEYYe", "ASLan");
        anagram("silent", "listgen");


    }

    public static void odds() {
        for (int i = 0; i < 101; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }

        }
    }

    public static void evens() {
        for (int i = 0; i < 101; i++) {
            if (i % 2 == 1) {
                System.out.print(i + " ");
            }

        }
    }

    public static void eligibleAlcohol() {


        int age = 15;
        if (age < 0 || age > 120) {
            System.out.println("Invalid age");
        } else {
            if (age >= 21) {
                System.out.println("Eligible");
            } else {
                System.out.println("Ineligible");
            }
        }
    }

    public static void vote(int age, String citizenship) {
        if (age<0 || age>120) {
            System.out.println("invalid");
        } else {
            if (age>=18) {
                if (citizenship.equalsIgnoreCase("USA")){
                    System.out.println("You are eligible to vote");
                } else {
                    System.out.println("You cannot vote");
                }
            } else {
                System.out.println("You cannot vote");
            }
        }
    }

    public static void grade (int score) {
        String grade = (score<60)? "F" : (score>=60 && score<70)? "D" : (score>=70 && score<80)? "C" : (score>=80 && score<90)? "B" : "A";
        System.out.println(grade);
    }

    public static void circle(double r) {
        double area = r*r*3.14;
        System.out.println(area);
    }

    public static void square(double a) {
        double area = a*a;
        System.out.println(area);
    }

    public static void dollarEuro (double dollar) {
        double euro = dollar*0.91;
        System.out.println(euro);
    }

    public static void dollarTL (double TL) {
        double dollar = TL*14.78;
        System.out.println(dollar);
    }

    public static void kglb (double kg) {
        double lb = kg*2.20462;
        System.out.println(lb);
    }

    public static void posnegzero (int num) {
        if (num==0) {
            System.out.println("zero");
        } else if (num<0) {
            System.out.println("negative");
        } else {
            System.out.println("positive");
        }
    }

    public static void eachString (String str) {
        for (int i = 0; i < str.length(); i++) {
            System.out.print(str.charAt(i) + " ");
        }

    }

    public static void eachElement () {
        int [] array= {10, 20,30,40,50};
        System.out.print(Arrays.toString(array) + " ");
    }

    public static void name (String name, String surname) {
        name = name.substring(0,1).toUpperCase()+ name.substring(1).toLowerCase();
        surname = surname.substring(0,1).toUpperCase()+ surname.substring(1).toLowerCase();
        System.out.println(name + " " + surname);
    }

    public static void anagram (String word1, String word2) {

       char [] ch1 = word1.toCharArray();
       char [] ch2 = word2.toCharArray();

               Arrays. sort(ch1);
       Arrays.sort(ch2);


        boolean equal = Arrays.equals(ch1, ch2);

        if (equal) {
            System.out.println("Anagram");
        } else {
            System.out.println("not anagram");
        }

            }
        }



/*
1. create a method that can print odd numbers between 1~100 in a same line saperated by space

	2. create a method that can print even numbers between 1~100 in a same line saperated by space

	3. create a method that can check if a person is eligible to buy alcohol

	4. create a method that can check if a person is eligible to vote
			Ex:
				eligibleToVote(19, "USA");

			output:
				You are not eligible to vote!


	5. create a method that can calculate the grade of the student based on the score

	6. create a method that can calculate the area of a circle

	7. create a method that can calculate the area of a square

	9. create a method that can convert dollar to euro

	10. create a method that can can convert dollar to lira

	11. create a method that can convert kg to lb

	12. create a method that can if the given integer is positive, negative or zero

	13. create a method named printEachChar that can print each characters of a string

	14. create a method named printEachElement that can print each elements of an integer array

	15. create a method named calculator that passes three arguments (num1, num2, mathOperator), prints the calculation result


	16.  write a method that can print out the full name of a person in regular format
            ex:
               fullName("cYdEo", "SCHOOL");

                output:
                    "Cydeo School"


    17. create a method that can check if two strings are anagram
    		ex:
    			anagram("silent", "listen")


			output:
				silent and listen are anagram




 */