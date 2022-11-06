package day33_Constructors_Static;

public class Iphone {
    public static String brand = "Apple"; //  aynı kalacak - tanımla
    public String model;                  // değişecdek - tanımlama
    public double price;
    public static String OS = "IOS";
    public String colour;
    public String size;
    public static String madeIn = "China";
    public static boolean hasFaceTime = true;

    public static void printModelandPrice () {  // ikisi de static olmadığı için STATIC olarak kabul etmez
        System.out.println(brand + " " + madeIn);                                     // STATIC method only accepts static members

    }
    public void method1 () {
        System.out.println(brand +" " + model); // static olmayan method ikisini de alır
    }

}
