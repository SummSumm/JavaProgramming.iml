package day16_LoopAndStringPractices;

public class LoopForUniques {
    public static void main(String[] args) {
        String str = "AABCCDE";

       boolean A =  str.indexOf("A") == str.lastIndexOf("A"); // bunlara gerek yok
        boolean B =  str.indexOf("B") == str.lastIndexOf("B");
        boolean C =  str.indexOf("C") == str.lastIndexOf("C");
        boolean D =  str.indexOf("D") == str.lastIndexOf("D");
        boolean E =  str.indexOf("E") == str.lastIndexOf("E");

        String result = "";

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (str.indexOf(ch)==str.lastIndexOf(ch)) {
                result +=ch;
        }
        }
        System.out.println(result);


    }
    }


/*
3. Write a program that can return the unique characters from a String

			Ex:
				input:
					AABCCD

				output:
					BD

			Hint: You will need indexOf() and lastIndexOf()
				  if the first and last index numbers of the character are same, then it's unique



				  indexOf('A') ==> 0
				  lastIndexOf('A') ==> 1


				  indexOf('B') ==>2
				  lastIndexOf('B') ==> 2

 */
