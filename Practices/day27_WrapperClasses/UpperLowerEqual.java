package day27_WrapperClasses;

public class UpperLowerEqual {

    public static void main(String[] args) {
String str = "AAAHaaa";

        System.out.println(upperLowerEqual(str));

    }

    public static boolean upperLowerEqual(String str) {
        int upperC = 0;
        int lowerC = 0;
        boolean isequal = false;
        String string = str;
        for (int i = 0; i < string.length(); i++) {
            char ch = string.charAt(i);

            if (Character.isLowerCase(ch)) {
                lowerC++;
            } else if (Character.isUpperCase(ch)){
                upperC++;
            }
        }
        if (lowerC==upperC) {
            isequal=true;
        }
    return isequal;
    }
}



/*
4. Write program that returns true if the total number of upper case characters are equal to total number of Lowercase characters of a string
		Ex:
			str = "JAVA java";

		output:
			true
*/