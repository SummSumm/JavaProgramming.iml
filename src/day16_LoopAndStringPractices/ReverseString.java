package day16_LoopAndStringPractices;

public class ReverseString {
    public static void main(String[] args) {

        String word = "Wooden Spoon";
        int W = word.indexOf("W");
        int n = word.lastIndexOf("n");
        int length = word.length();
String result = "";
        for (int i = length - 1; i >= 0; i--) {
result+=word.charAt(i);

        }
        System.out.println(result);

        /*
        1. Write a program that can reverse a String
			Ex:
				input:
					Wooden Spoon

				output:
					noopS nedooW
         */
    }
}
