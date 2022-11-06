package Week04;

public class Amazon {
    public static void main(String[] args) {

        double price = 25.30;
        int shipping = 10;
        double total = price+shipping;

        if (price>=25) {
            System.out.println("Free Shipping: $" + price);
        } else {
            System.out.println("Price: $" + total);
        }
        System.out.println("Thank you for shopping with us!");
    }
}
