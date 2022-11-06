package day46_Polymorphism;


import day43_OOPAbstraction.Audi;
import day43_OOPAbstraction.Car;
import day43_OOPAbstraction.Tesla;
import day44and45_OOPAbstraction_Interface.Animal.Animal;
import day44and45_OOPAbstraction_Interface.Animal.Cat;
import day44and45_OOPAbstraction_Interface.Animal.Dog;

import java.util.ArrayList;

public class PolymorphisimIntro {
    public static void main(String[] args) {


        Audi audi1 = new Audi("A3", "white", 2012, 150000);
        Tesla tesla1 = new Tesla("T3", "blue", 2020, 600000);

        // what do I do if I want both in the same array?
        ArrayList<Car> carList = new ArrayList();

        //Only methods in the parent can be used. The overridden versions are used if any
        Animal an1 = new Cat("Mimi", "Russian Blue", "female", 2, "Medium", "Gray");
        an1.eat();
        an1.drink();

        if (an1 instanceof Cat) {
            System.out.println("It is an instance of Cat");
        } else
            System.out.println("It's NOT an instance of Cat");
    }
}
