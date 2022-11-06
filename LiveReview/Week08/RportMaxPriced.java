package Week08;
import java.util.Arrays;
public class RportMaxPriced {
    public static void main(String[] args) {

        String [] items = {"gloves", "socks", "tshirt", "jumper"};
        double [] price = {10, 25, 36, 48};
        int [] ID = {1, 2, 3, 4};

        // how to find the max. priced item

        double maxprice = price[0];
        int indexofmax = 0;

        for (int i = 0; i < items.length; i++) {
            if (price[i]>maxprice) {
                maxprice = price[i];
                indexofmax = i;
            }

        }
        System.out.println("Index: " + indexofmax);
        System.out.println("Max price: " + maxprice);


    }
}
