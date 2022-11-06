package Week04;

public class Traffic {
    public static void main(String[] args) {
        int CarType = 2;
        boolean isRush= true;
        double price1 = 25.0, price2 = price1/2, price3=price2/2;

        if (CarType==1) {
            if (isRush) {
                System.out.println("Price = $" + price1);
            } else {
                System.out.println("Price = $" + price2);
            }
        } else {
            if (isRush) {
                System.out.println("Price = $" + price2);
            } else {
                System.out.println("Price = $" + price3);
            }

            }
        }

            }

