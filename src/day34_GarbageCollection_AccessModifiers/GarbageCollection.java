package day34_GarbageCollection_AccessModifiers;


import day30_CustomClass.Dog;
import day31_Constructors.Student;
import day32_CustomClass_Constructors.Car;

import java.util.ArrayList;
import java.util.Arrays;

public class GarbageCollection {


    // only unreferenced objects can be collected. - there's no variable calling the object
    // objects can become unreferenced in two ways: null keyword and assigning


    public static void main(String[] args) {
        String str = null; // can only be used with non-primitives
        //System.out.println(str.toUpperCase()); // bunu run edince compile error verir

        Car car1 = new Car("Toyota");  // how can I make this custom obj. eligible for garbage collection?
        car1 = null;

        // how can garbage collector collect it? -- Automatically!

        System.out.println("-----------------------------------");
        Dog dog1 = new Dog();
        dog1.name = "Lucy";
        new Dog(); // şimdi bu ikinci köpeği bir variablea bağlamazsak it'll be eligible for garbage collection
        // ya da ilk opegı buna bağlarız. O zamanda ilki eligible for garbage collection olur :)
        /*
        mesela: Dog dog1 = new Dog();
        dog1.name= "Max"; --> yeni kopeğin adı Max oldu. Lucy öldü :(
         */

        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(100);

        ArrayList<Integer> list2 = list1;

        list2.addAll(Arrays.asList(200, 300, 400));
        System.out.println(list1);
        System.out.println(list2);
        // there's nothing to collect here. They're completely the same

        System.out.println("--------------------------------------");
        Student student1 = new Student("Daphne", 26, 254789, 'F', 'A');
        student1.score = 'B'; // this will change the score of st2 as well

        Student student2 = student1; //- -- > these two are the same so any change we make to st1 affects st2
        System.out.println(student2.score);

        // if we change st2, it will affect st1
        student2.name = "Gayle";
        System.out.println(student1.name);

        System.out.println("------------------------------------------");

        ArrayList <String> l1 = new ArrayList<>();
        l1.add("Java");
        ArrayList <String> l2 = new ArrayList<>();
        System.out.println(l2);
        // unless you equalize them, Java will only be added to l1. If you equalize them; to both.
        l2=l1;
        System.out.println(l2);
    }

    // Addlilerde garbage collector eligible olmuyorlar çünkü bi ekleme var
    // primitivelerde eski olan eligible oluyor çünkü içi boşalıyor.
}
