package day32_CustomClass_Constructors;

public class Test {

    public Test () {
        System.out.println("default");
    }

    public Test (int a) {
        this();
        System.out.println("integer");
    }

    public Test (double a) {
        this(25);
        System.out.println("double");
    }
    public Test (String str) {
        this(2.5);
            System.out.println("String");
        }


    public static void main(String[] args) {
        // şimdi hangi bilgi tarzını girersek o gerçekleşecek

        new Test("Hello");
    }
}
