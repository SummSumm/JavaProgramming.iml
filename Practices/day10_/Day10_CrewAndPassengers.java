package day10_;

public class Day10_CrewAndPassengers {
    public static void main(String[] args) {
int Total= 563;
boolean Valid= Total==50||Total==75||Total==100;


if (Valid) {
    if (Total==50){
        System.out.println("20 crew, 30 passengers");
    }else if (Total==75) {
        System.out.println("25 crew, 50 passengers");
    }else {
        System.out.println("30 crew, 70 passengers");
    }

}else {
    System.out.println("Invalid passenger number");
}

    }
}
/*
2. Create a class called CrewAndPassangers, Given a number of people on
the ship (int number), determine how many need to be crew members and
how many can be passengers. Print how many of each type there should
be.
Total: 50  ====> 20 crew, 30 passengers
Total: 75  ====> 25 crew, 50 passengers
Total: 100 ====> 30 crew, 70 passengers
Any other number of people on the ship is not valid
NOTE: MUST USE NESTED IF. DO NOT USE MORE THAN ONE PRINT
STATEMENT
 */