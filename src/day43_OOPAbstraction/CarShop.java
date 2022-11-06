package day43_OOPAbstraction;

public class CarShop {
    public static void main(String[] args) {
         Audi audi1 = new Audi("A3", "white", 2012, 150000);
         Tesla tesla1 = new Tesla("T3", "blue", 2020, 600000);

        System.out.println(audi1);
        System.out.println(tesla1);

        audi1.setColor("pink");
        System.out.println(audi1);
    }

}
