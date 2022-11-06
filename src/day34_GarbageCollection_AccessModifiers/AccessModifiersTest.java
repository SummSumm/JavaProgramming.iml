package day34_GarbageCollection_AccessModifiers;

public class AccessModifiersTest {

    public static void main(String[] args) {
        System.out.println(AccessModifiers.publicData);
        System.out.println(AccessModifiers.defaultData);
      // System.out.println(AccessModifiers.privateData); --> bunu gormuyor
        // packageden de çıkarsak defaultu da gormeyecek

        System.out.println("-----------------------------");
        AccessModifiers.publicMethod();
        AccessModifiers.defaultMethod();
        // AccessModifiers.privateMethod(); almaz.
        // Başka packagea geçsek defaultu da almaz
    }



}
