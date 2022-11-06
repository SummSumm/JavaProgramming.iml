package day34_GarbageCollection_AccessModifiers;

public class StaticBlock {
    public static void main(String[] args) {
        System.out.println("Main method");
    }

    static {   // first thing to get executed + only runs once
        System.out.println("Static block");
    // we can write static methods here bc they will run once anyway

    }

}
