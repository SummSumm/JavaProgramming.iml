package day20_Arrays;
import java.util.Arrays;
import java.util.Scanner;
public class ArrayPRactice3
{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("How many numbers will you enter?");      // How many numbers they will give THEN (e.g. 3)
        int num = scan.nextInt();

        int [] numbers = new int [num];                             // We assign it here; so teh array will hold three numbers

        if (num<=0) {
            System.exit(0);
        }

        for (int i = 0; i < num; i++) {                             // now we'll ask repeatedly (3 times) to enter numbers
            System.out.println("Enter a number");
            numbers[i] = scan.nextInt();
        }
        System.out.println(Arrays.toString(numbers));               // it prints out the given numbers
        scan.close();

    }
}
