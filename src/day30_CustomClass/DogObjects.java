package day30_CustomClass;

import java.util.ArrayList;
import java.util.Arrays;

public class DogObjects {
    public static void main(String[] args) {
//create object of dog class

        Dog dog1 = new Dog();
        //ilk dog String gibi bişey

        // naming the dog:
        dog1.name = "Lucy";
        dog1.age = 2;
        dog1.breed = "Jack Russell";
        dog1.gender = 'F';
        dog1.size = "medium";
        dog1.colour="White and brown";

       // System.out.println(dog1); boyle yaparsak hashcode basar. Custom classımızda ToString yapmalıyız
/*
public String toString () {
        return name;
    }
    bunu yazdık şimdi namei basacak. ama herbir object için yapmalıyız
    heosini yapınca basar
 */
        System.out.println(dog1);

       Dog dog2 = new Dog();
        dog2.name = "Halo";
        dog2.age = 3;
        dog2.colour = "white";
        dog2.size = "small";
        dog2.breed = "chihuahua";
        dog2.gender = 'M';
        System.out.println(dog2);

        Dog dog3 = new Dog();
        dog3.setInfo("Yoshi", "German Shephard", "big", "brown", 2, 'F');
        System.out.println(dog3);
        System.out.println("------------------------------");

        Dog dog4 = new Dog();
        dog4.setInfo("Kangal", "Kangal", "big", "white", 2, 'F');
        System.out.println(dog4);
        System.out.println("------------------------------");


        Dog dog5 = new Dog();
        dog5.setInfo("Kenzo", "bulldog", "small", "black", 2, 'M');
        System.out.println(dog5);
        System.out.println("------------------------------");


        dog1.eat();
        dog2.bark();
        dog3.bark();

        System.out.println("-------------------------------");

        // arraye sok male ile femaleı ayır

       ArrayList <Dog> allDogs = new ArrayList<>();
        ArrayList <Dog> femaleDogs = new ArrayList<>();
        ArrayList <Dog> maleDogs = new ArrayList<>();
        allDogs.addAll(Arrays.asList(dog1, dog3, dog2, dog4, dog5));

        for (Dog each: allDogs) {
            if (each.gender=='M') {
                maleDogs.add((each));
            }
        }
        System.out.println(maleDogs);



        allDogs.removeIf(p -> p.gender=='M');
        femaleDogs=allDogs;

        System.out.println(Arrays.asList(femaleDogs) + "\n");







    }
}
