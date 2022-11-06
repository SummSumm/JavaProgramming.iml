package day52_Maps_Lambda;

public class Test2 {
    public static void main(String[] args) {
        MySecondFunctionalInterface<String> printEach = s -> {
            for (String each : s.split("")) {
                System.out.println(each);
            }
        };

        printEach.test("Wooden");

        MySecondFunctionalInterface <Integer> cube = s -> System.out.println(s*s*s);
        cube.test(6);


    }
    }
