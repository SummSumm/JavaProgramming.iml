package day20_Arrays;
import java.util.Arrays;
public class IntegerArray {
    public static void main(String[] args) {

        int [] nums = {10, 20, 30, 40};
        System.out.println(Arrays.toString(nums));
        System.out.println("-------------------------------------");

        int scores [] = new int [4] ;// şimdi basarsak null basar çünkü belirlemedik henuz
        scores [0] = 20;
        scores [1] = 95;
        scores[2] = 52;
        scores [3] = 45;

        System.out.println(Arrays.toString(scores));
        System.out.println(scores[0]);
        System.out.println(scores [scores.length-1]);

    }
}
