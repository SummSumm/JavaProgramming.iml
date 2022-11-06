package day27_WrapperClasses;

public class CharacterClass {
    public static void main(String[] args) {

        //isDigit()

        char ch1 = '8';
        char ch2 = 'L';
        boolean digit = Character.isDigit(ch1);
        boolean digit2 = Character.isDigit(ch2);
        boolean letter1 = Character.isLetter(ch2);
        System.out.println(ch1 + " is digit? -->" + digit);
        System.out.println(ch2+ " is digit? -->" + digit2);
        System.out.println(ch2 + " is letter? -->" + letter1);

        System.out.println("----------------------------------------");

        //upperCase
        //lowerCase
        boolean upper = Character.isUpperCase(ch2);
        boolean lower = Character.isLowerCase(ch2);
        System.out.println(ch2 + " is upper case? -->" + upper);
        System.out.println(ch2 + " is lower case? -->" + lower);

        System.out.println("----------------------------------------");



    }
}
