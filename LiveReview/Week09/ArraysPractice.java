package Week09;
import java.util.Arrays;
public class ArraysPractice {
    public static void main(String[] args) {

        int [][] arr = { {3,12,3,34,12}, {13,7,456,34,3}, {-5, -24, -2, -10, -4} }; // once normal arraye çevirelim

        System.out.println(Arrays.deepToString(arr));

        int [] biggestNumbers = new int[arr.length];  // her küçülttüğümüzde  sayısını belirlemeliyiz

        for (int i = 0; i < arr.length; i++) {
            int max = arr[i][0];
            for (int each : biggestNumbers) {
                if (each>max) {
                    max=each;
                }
            }
biggestNumbers[i] = max;
        }
        System.out.println(Arrays.toString(biggestNumbers));
    }


}

