package day15_Loop;

public class Sum100 {
    public static void main(String[] args) {


        int sum = 0;
        System.out.println("Even numbers: ");
        for (int i = 0; i < 101; i++) {
            if (i%2==0) {
            sum+=i;

            System.out.print( i + " ");}
        }
        System.out.println(" ");
        System.out.println("Odd numbers: ");
        for (int j = 0; j < 101; j++) {
            if (j % 2 == 1) {
                sum += j;

                System.out.print(j + " ");
            }
        }


    }
}
