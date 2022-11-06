package day41_Exceptions1;

public class TryCatchBlocks {
    public static void main(String[] args) {
        System.out.println("Test started");
        System.out.println("--------------------");
        try {
            System.out.println("Try block");
            System.out.println(9 / 0);
        } catch (ArithmeticException e) {
            System.out.println("Catch block");
            System.out.println("Arithmetic Exception error");
        }

        System.out.println("Test complete");
        System.out.println("Test 2 started");

        int[] nums = {1, 2, 3, 4, 5, 6};
        try {
            System.out.println(nums[12]);
            System.out.println("Try block");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Catch block");
            e.printStackTrace();
        }
        System.out.println("Test 2 complete");
        System.out.println("--------------------");

        try {
            System.out.println(nums[12]);
            System.out.println("Try block");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Catch block");
            e.getMessage();
        }
        System.out.println("Test 3 complete");
        System.out.println("--------------------");

        System.out.println("Test 4 complete");
        try {
            System.out.println("Cydeo".substring(2,0));
            System.out.println("Try block");
        } catch (RuntimeException e) {
            System.out.println("Catch block");
            e.printStackTrace();
        }
        System.out.println("Test 4 complete");
        System.out.println("--------------------");

        System.out.println("Test 5 started: Checked block");
        System.out.println("Hello");
        try {
 Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Test 5 complete");



    }
}
