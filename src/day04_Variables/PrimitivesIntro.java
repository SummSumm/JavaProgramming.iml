package day04_Variables;

public class PrimitivesIntro {
    public static void main(String[] args) {

        // age: 38 yo --> byte data type
        // Datatype VariableName
        byte age = 38;
        /* weight: 160 pounds --> short data type
        byte olmazdı çünkü 127'den fazla
        */
        short weight = 160;
        //salary: 100,000 this is out of both bounds; so we use int
        int salary = 100_000;     // DEFAULT FOR INTEGERS
        //population: 8,000,000,000
        long population = 8_000_000_000L;
        /* we have to put an L at the end so that
        the code doesn't recognize it as int, which it does by default
         */
        float tax = 0.26F;
        double pi = 3.14;    // DEFAULT FOR DECIMALS
    }


}
