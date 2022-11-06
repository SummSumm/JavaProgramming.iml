package day09_IfElse.day15_ForLoops;

public class Starts_endsWith {
    public static void main(String[] args) {

        String word = "wooden spoon";


        // this one is case sensitive. You'll have to make use of the lowercase.

        boolean wordlower = word.toLowerCase().startsWith("w");
        boolean wordupper = word.toUpperCase().startsWith("W");

        System.out.println(wordlower + " " + wordupper);
    }
}
