package day18_NestedLoop;
import java.util.Scanner;
public class RoomReservation {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int price = 0;
        int total = 0;
        String yn = "";


        while (true) {
            System.out.println("What room would you like? (king/queen/single)");
            String room = scan.next();

            while (!(room.equalsIgnoreCase("king") || room.equalsIgnoreCase("queen") || room.equalsIgnoreCase("single"))) {
                System.out.println("Invalid room, please try again");
                room = scan.next();
            }


            System.out.println("How many nights are you staying?");
            int nights = scan.nextInt();

            if (room.equalsIgnoreCase("king")) {
                total += 120*nights;

            } else if (room.equalsIgnoreCase("queen")) {
                total += 100*nights;

            } else if (room.equalsIgnoreCase("single")) {
                total += 80*nights;

            }

            System.out.println("Would you like to book another room?");
            yn = scan.next();

            while (!(yn.equalsIgnoreCase("yes") || yn.equalsIgnoreCase("no"))) {
                System.out.println("Invalid answer. Please re-try.");
                yn = scan.next();
            }

            if (yn.equalsIgnoreCase("no")) {
                System.out.println("Your total is " + total);
                System.out.println("Thank you! Bye");
                System.exit(0);
            }
        }




        }
    }

