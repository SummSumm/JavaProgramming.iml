package day21_Array_For_Each;
import java.util.Arrays;
public class INTERVIEW_anagrams {
    public static void main(String[] args) {

        String [] str1 = {"e", "a", "r", "t", "h"};
        String [] str2 = {"h", "e", "a", "r", "t"};

        Arrays.sort(str1);
        Arrays.sort(str2);

        boolean same = Arrays.equals(str1, str2);

        if(same) {
            System.out.println("str1 and str2 are anagrams");
        }
    }
}
