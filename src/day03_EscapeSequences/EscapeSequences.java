package day03_EscapeSequences;
/*
ESCAPE SEQUENCES:  MUST be given in double quotes
\n --> starts a Newline in the same quotation marks
\t --> tab button
\\ --> to pint a backward slash
\" --> to print a quotation mark
 */


public class EscapeSequences {
    public static void main(String[] args) {
        System.out.println("Java \nPython C#");
        System.out.println("-------------------------");

        System.out.println("Hello Cydeo \nHow are you all today? \nIt's nice to see you all \nWhat class do we have next week?");
        System.out.println("-------------------");

        System.out.println("\tJava is a cool programming language");
        System.out.println("-------------------");

        System.out.println("/ \\");   // to give a backward slash, use the bw slash twice
        System.out.println("-------------------");

        System.out.println("Hagrid said \"Yer a wizard, Harry\""); //for a double code, use the bw slash AND quot. marks
        System.out.println("-------------------");


    }


}
