package day21_Array_For_Each;

public class Average {
    public static void main(String[] args) {
        int [] numbers = {10,20,30,40,50,60,70,80,90};
        int sum = 0;

        for (int number : numbers) {
            sum+=number;

        }
        double av = sum/numbers.length;
        System.out.println(av);
    }
}
