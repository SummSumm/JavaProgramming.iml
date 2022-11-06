package day09_IfElse.day15_ForLoops;
import java.util.Locale;
import java.util.Scanner;
public class WarmUps {
    public static void main(String[] args) {

        /*
        1. Write a program that asks user to enter a word. If the work starts with x, replace it with a.
                    Input:
                        xcodex
                    Output:
                        acodex
         */
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a word");
        String word = input.nextLine();

        char firstletter = word.charAt(0);
        if (firstletter=='x') {
            String wordnew = word.replaceFirst("x", "a");
            System.out.println(wordnew);
        } else if (firstletter=='X') {
            String wordnew2 = word.replaceFirst("X", "A");
            System.out.println(wordnew2);
        } else {
            System.out.println(word);
        }

        System.out.println("-----------------------------------------------");
/*
2. Write a program that asks user to enter a word. and replace all the x or X with character a
                    Input:
                        xcodeX
                    Output:
                        acodea
 */

        Scanner newinput = new Scanner(System.in);

        System.out.println("Enter a word");
        String str = newinput.nextLine();

        String str1 = str.replace("x", "a").replace("X", "a");

        System.out.println(str1);
        System.out.println("---------------------------------------------------");
/*
3. Write a program that asks user to enter first and last names, and then prints the full name in regular format (first character in upper case)

                    input:
                        firstName = "cyDEo"
                        lastName = "SCHOOL";

                    output:
                        Cydeo School
 */
        Scanner inputt = new Scanner(System.in);
        System.out.println("Enter your name and surname");
        String namesurname= inputt.nextLine();

        int space = namesurname.indexOf(" "); //7
        int lastindex = namesurname.length();

        String firstname = namesurname.substring(0,space);



        String firstnamee= ((firstname.substring(0,1).toUpperCase()) + (firstname.substring(1,space).toLowerCase()));
        String lastnamee = ((namesurname.substring(space+1,space+2).toUpperCase()) + (namesurname.substring(space+2,lastindex).toLowerCase()));
        System.out.println(firstnamee + " "+ lastnamee);



input.close();
inputt.close();
newinput.close();


    }
}
