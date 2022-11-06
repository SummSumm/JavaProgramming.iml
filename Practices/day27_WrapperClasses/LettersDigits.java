package day27_WrapperClasses;

import java.util.ArrayList;
import java.util.Arrays;

public class LettersDigits {
    public static void main(String[] args) {
        String str = "afsd2789ghfg//-";
retrieve(str);

    }

    public static String retrieve (String string) {
String str = string;
String letters = "";
String digits = "";
String specials = "";
        for (int i = 0; i<str.length(); i++) {
            char ch = str.charAt(i);

            if (Character.isLetter(ch)) {
                letters+=ch;
            }else if (Character.isDigit(ch)) {
                digits +=ch;
            } else {
                specials+=ch;
            }

        }
        System.out.println("letters = " + letters);
        System.out.println("digits = " + digits);
        System.out.println("specials = " + specials);


        return str;
    }

}
/*


3. Write a program that can retrieve the letters, digits and special characters from the string
		Ex:
			str = "Wooden Spoon!"

		output:
			letters= "WoodenSpoon";
			Digits = "";
			specialChars = " !";
 */