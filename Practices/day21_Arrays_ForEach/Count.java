package day21_Arrays_ForEach;

public class Count {
    public static void main(String[] args) {

        int [] numbers = {5, 8, 59, 47 ,100 , 300, 111};
        int countO = 0;
        int countE = 0;

        for (int each : numbers) {
            if (each%2==0) {
                countE++;
            } else{
                countO++;
            }
        }
        System.out.println("Even number count= " + countE);
        System.out.println("Odd umber count= "+ countO);
    }
}
/*
2. Write a program that can count the even and odd number from an array of integers

			Note: MUST use for each loop
 */