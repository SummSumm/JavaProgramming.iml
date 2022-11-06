package day32_CustomClass_Constructors;

public class ConstructorCalls {

    public ConstructorCalls () {
        System.out.println("default");
    }

    public ConstructorCalls (int a) {
        this();   // constructor call must be the first step
        System.out.println("int: " + a);
    }

    public ConstructorCalls (String str) {
        this(10);
        System.out.println("String");
    }

    public static void main(String[] args) {
        ConstructorCalls obj1 = new ConstructorCalls(); // gets default
        System.out.println("-----------------------------------------");
        ConstructorCalls obj2 = new ConstructorCalls(12); // now gets both default and int
        System.out.println("-----------------------------------------");
        ConstructorCalls obj3 = new ConstructorCalls("hello"); //  now gets all three
    }
}
