package day15_Loop;

public class SpecialCharacters {
    public static void main(String[] args) {

        String str = "agfke+658?E+T!'";
        String letters = "";
        String specials = "";
        String numbers = "";
        String lower = "";
        String upper = "";


        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (ch>=48 && ch<=57) {
                numbers += ch;

            } else if (ch>=65 &&ch<=90) {
                upper += ch;
            }else if (ch>=97 &&ch<=122) {
                lower += ch;
            } else {
                specials += ch;
            }

        }
        letters = upper+lower;
        System.out.println("letters: " + letters);
        System.out.println("numbers: " + numbers);
        System.out.println("special characters: " + specials);

    }
}
/*
  5. write a program that can retive the digits, letters and special characters from a string
            Ex:
                input:
                    mn@#123Ab!

                output:
                    letters: mnAb
                    digits: 123
                    special chars: @#!
 */