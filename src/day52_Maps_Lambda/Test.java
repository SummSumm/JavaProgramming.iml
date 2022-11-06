package day52_Maps_Lambda;

public class Test {
    public static void main(String[] args) {
// is the number odd?
        MyFirstFunctionalInterface oddorevennumber = (p) -> {
            if (p % 2 == 0) {
                System.out.println("Even");
            } else  {
                System.out.println("Odd");
            }
        };

        oddorevennumber.apply(20);
// is the person eligible to buy alcohol
        MyFirstFunctionalInterface eligibleAlcohol = (p) -> {
            if (p>=18) {
                System.out.println("Eligible");
            } else {
                System.out.println("Not eligible");
            }
        };
        eligibleAlcohol.apply(25);

// display  the cube of a number

        MyFirstFunctionalInterface cube = (p) -> {
            System.out.println(p*p*p);
        };

        cube.apply(4);

        // is a number divisible by 3
        MyFirstFunctionalInterface divisibleBy3 = p ->  {
          if (p%3==0) {
              System.out.println("divisble by 3");
          }  else {
                System.out.println("NOT divisble by 3");
            }
        };
        divisibleBy3.apply(5);
    }
}

