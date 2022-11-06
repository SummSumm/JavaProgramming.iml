package day17_While_Do;

public class DivisibleBy {
    public static void main(String[] args) {
        int end = 35;
        String count3="";
        String count5="";
        String count15="";


        for (int i = 1; i <= end; i++) {
            if (i%3==0) {
                count3 += i + " ";
            }else if (i%5==0) {
                count5 += i + " ";
            }

            if (i%15==0) {
                count15 += i + " ";
            }

        }
        System.out.println("Divisible by 3: " + count3);
        System.out.println("Divisible by 5: " + count5);
        System.out.println("Divisible by 15: " + count15);



    }
}
