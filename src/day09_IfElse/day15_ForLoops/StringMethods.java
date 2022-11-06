package day09_IfElse.day15_ForLoops;

import java.util.Locale;

public class StringMethods {
    public static void main(String[] args) {

        String r = "adsf";
        boolean result = r.isEmpty();
        System.out.println(result);

        String rr= "";
        boolean result2 = rr.isBlank();
        System.out.println(result2);
        System.out.println("---------------------------------");

        String sent1 = "I love Java";
        String sent2 = "java";

        boolean resultt = sent1.contains(sent2);
        System.out.println(resultt); // false bc they are different. How to solve case sensitivity?
        boolean sent3 = sent1.toLowerCase().contains(sent2);
        System.out.println(sent3);
        System.out.println("-----------------------------------");




    }

}
