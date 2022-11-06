package Githubdan;

import java.util.Arrays;
import java.util.Scanner;

public class Arrays1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] arr = new String[5];
        for (int i = 0; i < 5; i++)                  // index no olmadığı için for-each kullnamayız
        {
            arr[i] = input.nextLine();         // array olarak alacağımızda köşeliyi unutmayalım ++ Kullanıcıdan alırken input.nextLine()
        }                                      //once konsoldan for ile alalım. Sonra for-each yapabiliriz

        for (String each : arr) {
            System.out.println(each.substring(0, 3));               // son indexi dahil etmez
        }
        input.close();    }
}

/*
The code provided in your main method will take in five Strings and save them into an array called arr.
Print out the first three letter of each element on seperate lines.
You can assume that every element of arr is at least 3 letters long.

Example:
arr -> ["hello", "how", "are", "you", "doing"]

Output:
hel
how
are
you
doi
 */