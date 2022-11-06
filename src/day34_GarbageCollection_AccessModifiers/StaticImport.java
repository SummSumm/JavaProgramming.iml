package day34_GarbageCollection_AccessModifiers;
import static day34_GarbageCollection_AccessModifiers.circle.pi;
public class StaticImport {
    // to import ONLY static members and not everything
    public static void main(String[] args) {
        //let's get the pi --> to the top
        double radius = 2.0;
        double perimeter = radius*2*pi;

        System.out.println("perimeter = " + perimeter);
    }
}
