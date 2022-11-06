package day21_Array_For_Each;
import java.util.Arrays;
public class ArraysUtility {
    public static void main(String[] args) {
        int [] num = {1,2,3,4,5};
        //bunu print etmeye çalışırsak olmayacak;once toString yapmalıyız

        System.out.println(Arrays.toString(num));


        System.out.println("-------------------------");

        int [] scores = {20,56,89,54,100,25,37};
        Arrays.sort (scores);
        System.out.println(Arrays.toString(scores));
        System.out.println("min score: " + scores[0]);
        System.out.println("maz score: " + scores[scores.length-1]);

        System.out.println("---------------------------");
        String [] names = {"Bugra", "Feyza", "Duygu", "Bilal", "Hursit"};
        Arrays.sort(names);
        System.out.println(Arrays.toString(names)); // Alphabetical order

        System.out.println("---------------------------");

    }



}
