package utilities;
import java.util.Arrays;
public class StringUtility {

    public static void printEachChar(String str) {

        for (int i = 0; i < str.length(); i++) {
            System.out.println(str.charAt(i));


        }
    }

    public static String reverse(String str) {
        String result = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            result += str.charAt(i);
        }
        return result;
    }

    public static boolean isPalindrome(String str) {

        return reverse(str).equalsIgnoreCase(str);

    }

    public static boolean isAnagram(String word1, String word2) {
        // array from string

        char[] a = word1.toCharArray();
        char[] b = word2.toCharArray();

        Arrays.sort(a);
        Arrays.sort(b);

        return Arrays.equals(a, b);


    }

    public static String removeDuplicates(String word) {
// yeni Stringe tekrarlananı ekleme dicez
        String result = "";
        for (int i = 0; i < word.length(); i++) {
            char each1 = word.charAt(i);

            if (!(result.contains("" + each1))) {
                result += each1;
            }
        }

return result;
    }
}

