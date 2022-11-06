package day25_CustomMethod_Overloading;
import java.util.Arrays;
public class MethodOverloadingIntro {
    public static void main(String[] args) {
        int [] arr = {5,6,8,-1,3,4};
        Arrays.sort(arr);   // sorts INT
        System.out.println(Arrays.toString(arr));

        double [] arr2 = {10.5,11.5,4.5,5.5};
        Arrays.sort(arr2); // sorts double
        System.out.println(Arrays.toString(arr2));

        char [] arr3 = {'E', 'F', 'B', 'Z'};
        Arrays.sort(arr3); // sorts char
        System.out.println(Arrays.toString(arr3));

        System.out.println("------------------------------------------------");

int a = sumnumbers(1,2,3,4);
int b = sumnumbers(5,6,7);

int ab = a+b;
        System.out.println(ab);


    }
    // make the names same -- not overloaded yet
    public static int sumnumbers(int num1, int num2) {
        int sum = num1+num2;
        return sum;
    }

    public static int sumnumbers(int num1, int num2, int num3) {
        int sum = num1+num2+num3;
        return sum;
    }

    public static int sumnumbers(int num1, int num2, int num3, int num4) {
        int sum = num1+num2+num3+num4;
        return sum;
    }

    // change the parameter but keep the name (data type  or number of) -- now overloaded
    public static double sumnumbers(double num1, double num2) {
        double sum = num1+num2;
        return sum;
    }

    public static double sumnumbers(double num1, double num2, double num3) {
        double sum = num1+num2+num3;
        return sum;
    }

    public static double sumnumbers(double num1, double num2, double num3, double num4) {
        return sumnumbers (num1, num2, num3) + num4;
    }
}
