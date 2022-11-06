package day21_Arrays_ForEach;

public class NumberOfApparances {
    public static void main(String[] args) {
        String [] sent = {"Java", "JAva", "Python", "hello", "Java"} ;

        int countJ = 0;
        int countP = 0;

        for (String s : sent) {
            if (s.equalsIgnoreCase("java")) {
                countJ++;
            }
            if (s.equalsIgnoreCase("python")) {
                countP++;
            }
        }
        System.out.println("Java count: " + countJ);
        System.out.println("Python count: " + countP);
    }
}
/*
6. Write a program that can return the number of appearances of “java” and “python” anywhere in the sentence.
				(similar to the task 97 in repl.it, but this time you MUST use arrays and for each loop)
 */