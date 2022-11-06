package day21_Array_For_Each;
import java.util.Arrays;

public class Anagram {
    public static void main(String[] args) {
        String str1 = "acdb";
        String str2 = "dcba";

        char [] str11 = str1.toCharArray();   // char Arraye çevirelim ki karakterleri sort edebilelim
        char [] str22 = str2.toCharArray();

        Arrays.sort(str11);
        Arrays.sort(str22);

        //System.out.println(Arrays.toString(str11));
       //System.out.println(Arrays.toString(str22));

       // System.out.println("Now they are sorted");

        boolean same = Arrays.equals(str11, str22);


        if (same)
            System.out.println("yes, they are anagrams");


        /*
        if (str11.equals(str22)) {

            System.out.println(str11 + " and " + str22 + " are anagrams."); bunu kullanamıyoruz çünkü ARRAYler, String değil
        } */
    }

}
