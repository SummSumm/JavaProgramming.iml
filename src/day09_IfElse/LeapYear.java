package day09_IfElse;

public class LeapYear {
    public static void main(String[] args) {

        int year = 2001;

        boolean leapyear = year%4==0;

        if (leapyear) {
            System.out.println(year + " is a leap year.");
        } else {
            System.out.println(year + " is not a leap year.");
        }

    }
}
