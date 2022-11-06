package day23_CustomMethods;

public class MethodPractice2 {
    public static void main(String[] args) {
helloworld();
        System.out.println("--------------------------------------");
helloCydeo();
        System.out.println("----------------------------------");
        even10();

    }

        public static void helloworld ()  {
        for (int i = 0; i < 5; i++) {
            System.out.println("Hello world");

        }
    }

        public static void helloCydeo () {
                for (int i = 0; i <5 ; i++) {
                    System.out.println("Hello Cydeo");

                }

        }

        public static void even10 (){


            for (int i = 1; i < 11; i++) {
if (i%2==0) {
    System.out.println(i);
}
            }

        }


}
