package day18_NestedLoop;

public class Divide2Numbers {
    public static void main(String[] args) {
        // divide 20/6 with no divison

        int a = 20;
        int b = 6;
        int count = 0;


        while (a>=b) {
            a -=b;
            count++;


        }System.out.println(count);
        System.out.println("------------------");

        int x = 30;
        int y = 7;
        int freq = 0;

        while (x>=y) { // keep doing until x is greater than y (bc when it's lower, it's the remaining)
            x-=y;
            freq++;

        }
        System.out.println(30 + " divided by " + y + " equals " + freq + " with a remainder of " + x);
        System.out.println("--------------------------");

        int h = 0;
        int t = 9;

        for (int i = 0; i < 12; i++) {
            int total = h*t;
            h++;
            System.out.println(h + " times " + t + " equals " + total);

        }
    }
}
