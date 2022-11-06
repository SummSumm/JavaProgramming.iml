package day44and45_OOPAbstraction_Interface.Animal;

public class PropertiesOfInterface {
    int x;                                               // instance varible
    static int a;                                        // static variable

    public PropertiesOfInterface(int x) {                // constructor for instance variable
        this.x = x;
    }

    static {
        a=10;                                            // static block
    }

    public void method1 () {
        System.out.println("Instance method");           // instance method
    }

    public static void method2 () {
        System.out.println("Static method");             // static method
    }

    //in an abstract class, we can have abstract method (empty method)
    // If the class were interface, everything except the static METHOd would give a compiler error
    // as for the variables, if you directly initialize them, then they are ok (static and final by default)

}
