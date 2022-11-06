package day16_LoopAndStringPractices;

public class palindrome {
    public static void main(String[] args) {

        String word = "herbert";

String result = "";
       for (int i = word.length() - 1; i >= 0; i--) {
            result +=word.charAt(i);
       }
       if (word.equalsIgnoreCase(result)) {
           System.out.println("this word is a palindrome");
       }else {
           System.out.println("this word is NOT a palindrome");
       }
    }
}

