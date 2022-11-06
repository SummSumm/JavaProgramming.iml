package day13_String;
import java.util.Scanner;
public class sentence {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a sentence");
        String sent = scan.nextLine();
        int space = sent.indexOf(' ');
        int lastspace = sent.lastIndexOf(' ');

        String word1 = sent.substring(0,space);
        String last = sent.substring(lastspace+1);

        System.out.println("The first word is " + word1 + " and the last word is " + last + ".");
        // first and last words

        System.out.println("---------------------------------");

        System.out.println("Enter word 1");
        String str1 = scan.nextLine();
        System.out.println("Enter word 2");
        String str2 = scan.nextLine();

        if (str1.length()>str2.length()) {
            System.out.println(str1 + " is a longer word than " + str2);
        } else {
            System.out.println(str2 + " is a longer word than " + str1);
        }

scan.close();
    }
}
