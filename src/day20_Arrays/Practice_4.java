package day20_Arrays;

public class Practice_4 {
    public static void main(String[] args) {

        String [] words = {"anna", "level", "Java"};

        int count =0;              // when the output asks for a number --> int count =0;



        for (String word : words) {
            String reverse = "";       // arraydeki kelimeleri alması için loopa yazmalıyız
            for (int j = word.length() - 1; j >= 0; j--) {
                reverse += word.charAt(j);
            }
            if (word.equalsIgnoreCase(reverse)) {
                count++;
            }
        }
        System.out.println(count);
        }


    }

/*
   4. write a program that can count how many palindromes in an array of string
        Ex:
            {"anna", "level", "Java"};

            output:
                2
 */