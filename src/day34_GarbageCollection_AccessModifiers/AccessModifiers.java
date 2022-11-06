package day34_GarbageCollection_AccessModifiers;

public class AccessModifiers {

    public static int publicData = 100; // PUBLİC
    static int defaultData = 200; // DEFAULT --> default oldugu için direkt static yazıyoruz
   private static int privateData = 300; // PRIVATE

    public static void main(String[] args) {
        System.out.println(publicData);
        System.out.println(defaultData);
        System.out.println(privateData);
    }

    public static void publicMethod () {
        System.out.println("public");
    }

    static void defaultMethod () {
        System.out.println("default");
    }

    private static void privateMethod () {
        System.out.println("private");
    }

}
