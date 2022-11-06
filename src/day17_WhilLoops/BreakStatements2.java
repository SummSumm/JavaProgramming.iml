package day17_WhilLoops;

public class BreakStatements2 {
    public static void main(String[] args) {

        for (char i = 'A'; i < 'F'; i++) {
            if (i=='C') {
                continue;
            }
            System.out.println(i);


        }
        System.out.println("---------------------------");
        for (int i = 0; i < 11; i++) {
            if (i%2==1) {
                continue; // skips odd numbers
            }
            System.out.println(i);

        }

    }
}
