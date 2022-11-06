package day15_Loop;

public class Reverse_Palindrome {
    public static void main(String[] args) {


    String str = "Istanbul";
    String result = "";

        for (int i = str.length()-1; i >= 0; i--) { // reversete i 0dan buyuk olmalı
            char ch = str.charAt(i);
            result +=ch;

        }System.out.println(result);

        System.out.println("---------------------------");

        String word = "level";
        char ch = 'l';
        char chh = 'l';

        for (int i = 0; i < word.length(); i++) {
             ch = word.charAt(i);
        }
        for (int j = word.length()-1; j >= 0 ; j--) {
             chh = word.charAt(j);

        }
        if (ch==chh)  {
            System.out.println("this word is a palindrome");
        } else {
            System.out.println("not a palindrome");
        }

}
}
