package Week07;
import java.util.Scanner;
public class ShoppingList2 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String shoppingListReport = "";
        String item = "";
        String countinue = "";
        double price = 0;
        int count = 1;
        double totalPrice = 0;

        do {                                // do once yapar, sonra whiledaki conditiona bakar
            System.out.println("Enter Item" + count + " and its price");
            item = scan.nextLine();
            price = scan.nextDouble();
            shoppingListReport = ("Item" + count + " : " + item + " Price: " + price);
            //Item1: Tomatoes Price: 5.5
            count++;
            totalPrice += price;
            System.out.println("Add one more item?");
            scan.nextLine();
            countinue = scan.nextLine();

        } while (countinue.equalsIgnoreCase("yes"));
        {
            System.out.println(shoppingListReport);
            System.out.println("Total price: " + totalPrice);
        }
    }

    }
