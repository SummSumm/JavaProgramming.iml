package day13_String;
import java.util.Scanner;
public class first_last_letter {
    public static void main(String[] args) {
        String word = "ohello";
        char ilk = word.charAt(0);
        char son = word.charAt(word.length()-1);
    if(ilk==son) {
        System.out.println("Same");
    }else {
        System.out.println("not same");
    }

        System.out.println("--------------------------");
    Scanner scan = new Scanner(System.in);
        System.out.println("Write a word");
        String word1 = scan.nextLine();
        System.out.println("Write another word");
        String word2 = scan.nextLine();

        System.out.println(word1.toUpperCase().charAt(0) + "." + word2.toUpperCase().charAt(0) + ".");

        System.out.println("--------------------------");
        System.out.println("enter a word");
        String w = scan.nextLine();

        if (w.length()==0) {
            System.out.println("The string is empty");
        } else if (w.length()<=3) {
            System.out.println(w);
        } else {
            System.out.println(w.substring(w.length()-3));
        }
scan.close();
        /*

5. Write a method that asks user to enter a string.
        if the string is empty, print: string is empty
        if the string has more than 3 characters, print the last three characters
        if the string has less than or equal 3 characters, print the string itself
         */
    }
}
/*
3. write a program that can check if the first and last characters of the string are same
            ex:
                level
            output:
                same


                4. write a program that can return the initials of the user

            ex:
                cybertek
                school

            output:
                C.S

 */