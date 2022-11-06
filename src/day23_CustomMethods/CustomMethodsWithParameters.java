package day23_CustomMethods;

public class CustomMethodsWithParameters {
    public static void main(String[] args) {
        oddOrEven(5);
        age(1988);
        allNumbers(2,10);
    }

        public static void oddOrEven(int number) {

            if (number % 2 == 0) {
                System.out.println("even");
            } else {
                System.out.println("odd");
            }
        }

        public static void age (int byear) {
        int age = 2022-byear;
            System.out.println("You are " + age + " years old.");
        }

        public static void allNumbers (int x, int y) {
            for (int i = x; i <=y ; i++) {
                System.out.print( i + " ");

            }
        }

}
