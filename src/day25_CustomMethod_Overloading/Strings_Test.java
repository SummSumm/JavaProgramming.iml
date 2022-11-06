package day25_CustomMethod_Overloading;
import utilities.StringUtility;

public class Strings_Test {
    public static void main(String[] args) {
        String str = "Hello";
        StringUtility.printEachChar(str);
        System.out.println("---------------------------------");

        // String reverse = StringUtility.reverse(str);
        // System.out.println(reverse)
        System.out.println(StringUtility.reverse(str));
        System.out.println("---------------------------------");
        String word = "ava";

        boolean palindrome = StringUtility.isPalindrome(word);
        System.out.println(palindrome);
        System.out.println("--------------------------------");
int count = 0;
String [] names = {"Anna", "Java", "mom", "racecar", "python"};

        for (String name : names) {
            if (StringUtility.isPalindrome(name)) {
                count++;
            }
        }
        System.out.println(count);

        System.out.println("-------------------------------");
        String one = "abcd";
        String two = "dcab";

        System.out.println(StringUtility.isAnagram(one,two));
        System.out.println("-------------------------------");

String strr = "aaaabbccdeeeff";

        System.out.println((StringUtility.removeDuplicates(strr)));



        }

    }

