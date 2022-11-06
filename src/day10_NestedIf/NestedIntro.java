package day10_NestedIf;

public class NestedIntro {
    public static void main(String[] args) {

        int score = 18;

        if (score >= 0 && score <= 100) {
            if (score >= 60) {
                System.out.println("Passed");
            } else {
                System.out.println("Failed");
            }

        } else {
            System.out.println("The score is invalid.");
        }

        System.out.println("-------------------------------------------------------------");

        //ELIGIBLE TO BUY ALCOHOL

        int age = 52;
        boolean hasID = false;

        if (hasID) {
            if (age >= 21) {
                System.out.println("Eligible");
            } else {
                System.out.println("Not eligible");
            }
        } else {
            System.out.println("You must have an ID");
        }

        System.out.println("-------------------------------------------------------");

        int day = 8;

        if (day < 7 && day > 0) {
            if (day == 1) {
                System.out.println("Monday");
            } else if (day == 2) {
                System.out.println("Tuesday");
            } else if (day == 3) {
                System.out.println("Wednesday");
            } else if (day == 4) {
                System.out.println("Thursday");
            } else if (day == 5) {
                System.out.println("Friday");
            } else if (day == 6) {
                System.out.println("Saturday");
            } else if (day == 7) {
                System.out.println("Sunday YAY!");


            }
        }else {
                System.out.println("Not a valid number.");
            }


        }
    }

