package day38_OOPInheritance_cont.CarTask;

public class CarPark {
    public static void main(String[] args) {

        Toyota t1 = new Toyota("Corolla", "white", 2020, 300000, 50000);
        BMW b1 = new BMW("X5", "black", 2019, 800000, 14000);
        Tesla tes1 = new Tesla("S", "blue", 2021, 1000000, 0);

        //CarPark HAS these cars
        // the cars ARE cars

        t1.start();
        b1.start();
        tes1.start();


    }
}
