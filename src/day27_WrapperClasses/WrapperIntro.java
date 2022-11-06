package day27_WrapperClasses;

public class WrapperIntro {
    public static void main(String[] args) {
        int num1= 200; // bunu nasıl collection ya da mape alırım? --> Wrapper class/autoboxing
        Integer n1 = num1; // implicitly autoboxed
        int num2 = n1; // unboxing




        int num3 = 200;
        // Long n3 = num3; can't do this
        // the primitive can only be converted to its own wrapper class
        //int to int long to long; but

        long longValue = n1; // n1 is int - this can be done; like implicit casting


    }
}
