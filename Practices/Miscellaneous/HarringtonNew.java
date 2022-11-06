package Miscellaneous;

import java.util.Scanner;

public class HarringtonNew {
    public static void main(String[] args) {
        int total = 40;

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the minutes you've worked today");


        for (int i = 0; i < 50; i++) {

            total += input.nextInt();
            System.out.println("Your new total is " + total);
            int hours = total/60;
            int mins = total%60;
            int dollars = hours*20;
            System.out.println("You have worked for " + hours + " hours and " + mins + " minutes. Your total earnings are CAD " + dollars + ".");
            System.out.println("Enter the minutes you've worked today");
        }

    input.close();
    }

}

/*
public class Miscellaneous.Harrington {
    public static void main(String[] args) {

        int totalMins = 545;
         totalMins += 0; // buraya gir


        int hours = totalMins/60;
        int mins = totalMins%60;
        int dollars = hours*10;
        System.out.println(totalMins + " minutes");
        System.out.println("The total hours is " + hours + " and the total minutes is " + mins + ".");
        System.out.println("You've earned $" + dollars + " so far.");
    }
}

/*
 int totalMins = oldHours + new; // SADECE BURAYA GİR
        int newHours= 30;
 */