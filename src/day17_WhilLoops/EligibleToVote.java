package day17_WhilLoops;
import java.util.Scanner;
public class EligibleToVote {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter age, please");
        int age = input.nextInt();

        while(age<1 ||age>120) {
            System.err.println("Invalid age. Please re-enter age");
            age = input.nextInt();
        }
        System.out.println("Are you a US citizen?");
        String answer = input.next();


        while(!(answer.equalsIgnoreCase("no") || answer.equalsIgnoreCase("yes"))) {
            System.err.println("Invalid answer. Please check");
            answer = input.next();
        }


        if (answer.equalsIgnoreCase("yes") && age>=18) {
            System.out.println("Congratulations, you can vote!") ;
        }        else {
            System.out.println("Sorry, you cannot vote.");
        }





input.close();

        }

    }

