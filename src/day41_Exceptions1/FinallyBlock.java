package day41_Exceptions1;

public class FinallyBlock {
    public static void main(String[] args) {

        int[] arr = {1, 2, 3};

        try {
            System.out.println(arr[12]);
            System.out.println("try block");
        } catch (RuntimeException e) {
            System.out.println("catch block");
            e.printStackTrace();
            // system.exit(0) --> to get the finally block to NOT execute
        } finally {
            System.out.println("finally block");
        }
    }
}
