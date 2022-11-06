package day17_While_Do;
import java.util.Scanner;
public class RoomReservation {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Would you like to book a room?");
        String ans = scan.nextLine();

        while (ans.equalsIgnoreCase("yes")) {
            System.out.println("What type of room? (King/queen/single)");
            String choice = scan.nextLine();

            if (choice.equalsIgnoreCase("king")) {
                System.out.println("Thank you for your choice. The price is $120");
                break;
            } else if (choice.equalsIgnoreCase("queen")) {
                System.out.println("Thank you for your choice. The price is $100");
                break;
            } else if (choice.equalsIgnoreCase("single")) {
                System.out.println("Thank you for your choice. The price is $80");
                break;
            }
            }
            if (ans.equalsIgnoreCase("no")) {
                System.exit(0);
        }
            scan.close();
    }
}


