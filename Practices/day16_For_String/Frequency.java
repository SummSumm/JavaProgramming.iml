package day16_For_String;
import java.util.Scanner;
public class Frequency {
    public static void main(String[] args) {


    Scanner scan = new Scanner(System.in);

        System.out.println("Write a sentence");
        String sent = scan.nextLine();
        System.out.println("Enter a character");
        String ch = scan.next();
        char given = ch.charAt(0);
        int count= 0;

        for (int i = 0; i < sent.length(); i++) {
            char cha = sent.charAt(i);

            if (given==cha) {
                count++;
            }

        }
        System.out.println(count);

}}
