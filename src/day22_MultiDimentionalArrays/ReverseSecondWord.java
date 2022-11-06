package day22_MultiDimentionalArrays;

import java.util.Arrays;

public class ReverseSecondWord {
    public static void main(String[] args) {

        // I love Java --> I evol Java

        String sent = "I love Java";
        String [] words = sent.split(" ");

        String reverse = "";
        for (int i = words[1].length()-1; i >=0 ; i--) {
           reverse += words[1].charAt(i);  // the second word is reversed

        }
       // System.out.println(words[0]+ " " + reverse + " "+ words[2] + ".");


        //sent = sent.replaceFirst(words[1], reverse);
        //System.out.println(sent);

        words[1]=reverse; // arrayde [I, evol, Java]

        for (String word : words) {
            System.out.print(word + " "); // aynı satırda bassın diye ln yi sildim
            
        }
    }
}
