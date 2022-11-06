package day14_StringMethods;

public class StringMethods4 {
    public static void main(String[] args) {

        // repeat works ONLY in version 11
        String word = "Sumeyye";
        String repeated = word.repeat(5);

        System.out.println(repeated);
        System.out.println("-------------------------------------------------------");

        //also

        System.out.println("Sumeyye".repeat(15));
        System.out.println("-------------------------------------------------------");
        System.out.println("Sumeyye\n".repeat(15));
        System.out.println("--------------------------------------------------------");


    }

}
