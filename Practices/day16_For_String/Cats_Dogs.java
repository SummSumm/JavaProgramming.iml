package day16_For_String;

public class Cats_Dogs {
    public static void main(String[] args) {

        String str = "caT dog dogG cAt";
        int cats = 0;
        int dogc =0;

        for (int i = 0; i <= str.length()-3; i++) {

            String cat = str.substring(i,i+3);
            if (cat.equalsIgnoreCase("cat")) {
                cats++;
            } else if (cat.equalsIgnoreCase("dog")) {
                dogc++;
            }

        }
        System.out.println("cats: " + cats);
        System.out.println("dogs: " + dogc);


    }
}
/*

5. write a program to print true if the string "cat" and "dog" appear the same number of times in the given sentence

	        Ex:
	            sentence = "caT dog dogG cAt"

	            output:
	                true
 */