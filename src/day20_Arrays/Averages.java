package day20_Arrays;
import java.util.Arrays;
import java.util.Scanner;
public class Averages {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);

        int sum = 0;
        System.out.println("How many numbers will you enter?");
        int num = scan.nextInt();

        for (int i = 0; i < num; i++) {
            System.out.println("Please enter a number");
int number = scan.nextInt();
sum += number;
        }

        System.out.println("Average if: " + sum/num);
        
        
        
    }


//    sout
}
