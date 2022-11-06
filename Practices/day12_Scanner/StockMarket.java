package day12_Scanner;
import java.util.Scanner;
public class StockMarket {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("How many shares do you have in total?");
        int share = scan.nextInt();

        if (share<=0) {
            System.exit(0);
        } else {
            System.out.println("How much is the value in total");
            double value = scan.nextDouble();
            scan.nextLine();
            System.out.println("What company do you have the most shares in?");
            String company = scan.nextLine();

            System.out.println("Your total stock market holding is " + value + ", made up of " + share + " shares. Most of your shares are in " + company + " company.");
        scan.close();
        }
    }
}
