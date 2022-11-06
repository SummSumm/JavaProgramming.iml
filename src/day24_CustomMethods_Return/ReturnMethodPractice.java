package day24_CustomMethods_Return;

public class ReturnMethodPractice {
    public static void main(String[] args) {
        int MaxNumber = maximumNumber(1000,200);
        System.out.println(MaxNumber);

    }


    public static int maximumNumber(int num1, int num2) {  // soutu sonra kullanırız
        int result = 0;
        if (num1 > num2) {
            result = num1;
        } else {
            result = num2;
        }
        return result;
    }

}
