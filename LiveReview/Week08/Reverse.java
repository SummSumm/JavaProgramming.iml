package Week08;
import java.util.Arrays;
public class Reverse {
    public static void main(String[] args) {

        int [] nums = {10, 20, 30, 40, 50};


        System.out.println("Before reverse: " + Arrays.toString(nums));

        for (int i = 0; i < nums.length/2; i++) {
            int temp = nums[i];
            nums[i] = nums [nums.length-1 - i]; // sondaki 0. index oldu
            nums[nums.length-1 - i] = temp;
        }
        System.out.println("After reverse: " + Arrays.toString(nums));
    }
}
