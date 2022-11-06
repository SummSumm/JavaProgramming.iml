package day12_Scanner;
import java.util.Scanner;
public class SpeedCheck {
    public static void main(String[] args) {

        int speedLimit = 55;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter current speed");
        int speed = scan.nextInt();
int fark = speed-speedLimit;

        if (speed>speedLimit) {
            System.out.println("You're going " + fark  + " km over the speed limit. Slow down!");
        } else {
            System.out.println("Thank you!");
        }


scan.close();
//            Enter current speed:
//            105
    }
}
//2. Write a program for the speed check. a variable named speedLimit is given and assigned, ask user to enter the current speed, if the current speed is over the speedLimit print slow down, otherwise do not print anything
//        Ex:
//
//
//            output:
//            You're driving 50 mph over the limit. Slow down!