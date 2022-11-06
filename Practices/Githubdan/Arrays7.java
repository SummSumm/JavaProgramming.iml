package Githubdan;

import java.util.Arrays;

public class Arrays7 {
    public static void main(String[] args) {

        String str = "I love Java";

        String[] words = str.split(" ");   // bu su anda array olarak doner; boşluk verdiğimiz için he bir kelimeyi ayırır
        System.out.println(Arrays.toString(words));

        for (int i = words.length - 1; i >= 0; i--) {
            // System.out.print(words[i] + " ");
        }

        for (String word : words) {
            String reverse = "";
            for (int i = word.length()-1; i >=0 ; i--) {
                reverse += word.charAt(i);
            }
            System.out.print(reverse + " ");
            }

    }
}
