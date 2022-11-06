package day17_While_Do;

public class Division {
    public static void main(String[] args) {

        int num = 65;
        int num2 = 13;
        int count = 0;

        while (num>=num2) {
            num-=num2;
            count++;

        }
        System.out.println(count);

    }
}
