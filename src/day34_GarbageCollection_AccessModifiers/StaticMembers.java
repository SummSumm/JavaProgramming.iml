package day34_GarbageCollection_AccessModifiers;

public class StaticMembers {

    static class class1 {         // ONLY inner classes can be static. Outer ones can't

    }


    public static int num = 1;   // variables can be static
    public static void method () {
    }                            // methods can be static

    static {}                    // blocks can be static

    // classes can also be static BUT there has to be a NESTED CLASS: go to the beginning


}
