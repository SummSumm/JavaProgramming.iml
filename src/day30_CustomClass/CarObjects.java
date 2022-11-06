package day30_CustomClass;

import day05_StringConcatenation.Car;

import java.util.ArrayList;
import java.util.Arrays;

public class CarObjects {
    public static void main(String[] args) {


        CarClass car1 = new CarClass();
        car1.setInfo("Mercedes", "GLA", "black", 2020, 700000);
        System.out.println(car1);
        car1.drive();
        System.out.println("--------------------------------------------------------------");

        CarClass car2 = new CarClass();
        car2.setInfo("Toyota", "Yaris", "Red", 2010, 150000);
        System.out.println(car2);
        car2.drive();
        System.out.println("---------------------------------------------------------------");
        // Car [] cars = {car1,car2};

        ArrayList <CarClass> carslist = new ArrayList<>();
        carslist.addAll(Arrays.asList(car1, car2));

        for (CarClass each : carslist) {
            System.out.println(each.brand + " "+  each.price);
        }

        carslist.removeIf(p -> p.brand.equals("Toyota") && p.year>2005 && p.year<2010); // bunları çıkardı
        System.out.println(carslist);
    }
}
