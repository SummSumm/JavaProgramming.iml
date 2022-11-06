package day31_Constructors;

public class pizza {

    public char size;
    public int cheese;
    public int pepperoni;

    public pizza(char size, int cheese, int pepperoni) {
        this.size = size;
        this.cheese = cheese;
        this.pepperoni = pepperoni;
    }

    public double calculateCost(){
        double startPrice = (size =='S')? 10 : (size=='M')? 12: 14;
        double total= startPrice + (cheese+pepperoni)*2;

        return total;
    }

    public String toString() {
        return "pizza{" +
                "size=" + size +
                ", cheese=" + cheese +
                ", pepperoni=" + pepperoni +
                ", Total Price= $" + calculateCost() +
                '}';
    }
}
