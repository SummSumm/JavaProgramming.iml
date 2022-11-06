package day12_String;

public class StingMethodsToLowerCase {
    public static void main(String[] args) {

        String str1 = "wooden spoon";
        str1 = str1.toUpperCase(); // if you don't do this, it will still show the lower case bc it's assigned there.
                                    // STRING is IMMUTABLE unless you re-assign it.
        String str2 = "WOODEN SPOON";
        str2 = str2.toLowerCase();

        System.out.println(str1);
        System.out.println(str2);

    }

}
