package day08_If;

public class maxNumber {
    public static void main(String[] args) {

        int n1 = 500;
        int n2 = 100;
        int n3 = 40;

        if (n1>n2&&n1>n3) {
            System.out.println("n1 is greater");
        } else if (n2>n1&&n2>n3) {
            System.out.println("n2 is greater");
        } else {
            System.out.println("n3 is greater");
        }
    }
}
