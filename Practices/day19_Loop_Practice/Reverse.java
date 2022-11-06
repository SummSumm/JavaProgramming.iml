package day19_Loop_Practice;

public class Reverse {
    public static void main(String[] args) {

        String word = "hello";
        String reverse= "";

        for (int i = word.length()-1; i >=0 ; i--) {
            char ch = word.charAt(i);
            reverse +=ch;


        }
        System.out.print(reverse);
    }
}
