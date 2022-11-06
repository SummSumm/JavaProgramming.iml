package Week08;
import java.util.Arrays;
public class ReportMinPrice {
    public static void main(String[] args) {

        String[] items = {"gloves", "socks", "tshirt", "jumper"};
        double[] price = {10, 25, 36, 48};
        int[] ID = {1, 2, 3, 4};

        // how to find the min. priced item

        double minprice = price[0];
        int indexofmin = 0;

        for (int i = 0; i < items.length; i++) {
            if (price[i]<minprice) {
                minprice = price[i];
                indexofmin = i;

            }

        }
        System.out.println("index of min price: " + indexofmin);
        System.out.println("orice of the minimum priced item: " + minprice);

    }
}
