package Week08;
import java.util.Arrays;
public class Practice {
    public static void main(String[] args) {

        String [] items = {"gloves", "socks", "tshirt", "jumper"};
        double [] price = {10, 25, 36, 48};
        int [] ID = {1, 2, 3, 4};

        // find jumper and print all details

        for (int i = 0; i < items.length; i++) {
            if (items[i].equalsIgnoreCase("jumper")) {
                String itemdetail = items[i] + " price: $" + price[i] + " ID: " + ID[i];
            System.out.println(itemdetail);
            break;
            }
        }
    }
}
