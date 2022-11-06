package day20_Arrays;

public class Practice_6 {
    public static void main(String[] args) {

        String [] sent = {"java", "python", "hello", "python", "hi", "java", "python"};

        int countJ = 0;
        int countP = 0;                     // kaç tane sonuç istiyorsa o kadar counter açmalıyız

        for (String word : sent) {         // for/each ile her bir elemanı ayırıyoruz
            if (word.equalsIgnoreCase("java")) {   // aynı iseler
                countJ++;                                     // countera ekle
            }
            if (word.equalsIgnoreCase("python")) {
                countP++;
            }
        }

        System.out.println("Java appears " + countJ + " times.");
        System.out.println("Python appears " + countP + " times.");
    }
}
/*

	6. Write a program that can return the number of appearances of “java” and “python” anywhere in the sentence.
				(similar to the task 97 in repl.it, but this time you MUST use arrays and for each loop)
 */