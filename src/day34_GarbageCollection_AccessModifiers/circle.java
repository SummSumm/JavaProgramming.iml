package day34_GarbageCollection_AccessModifiers;

import java.util.ArrayList;

public class circle {
    public double radius;
    public static double pi;
    public static String name;
    public static ArrayList<Integer> numbers; // this static requires more than 1 step so it goes in the static block

    public circle(double radius) {
        this.radius=radius;
        double perimeter = 2*radius*pi;
    }

    static {

        pi = 3.14;
        name="Circle";
        numbers = new ArrayList<>();   // Array List takes more than one step
    numbers.add(10);
    numbers.add(20);
    numbers.add(30);


    }

/*
    public static void main(String[] args) {  //

        pi = 3.14;
        name="Circle";
        numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);

        System.out.println(pi);
        System.out.println(name);
        System.out.println(numbers);
    } main is also a static. Can we use it to set statics: no
    it only works in one class
    */

}
