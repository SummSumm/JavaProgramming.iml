package day27_WrapperClasses;

public class WrapperClassMethods {
    public static void main(String[] args) {
        String num = "123";
        int num1 = Integer.parseInt(num);
        System.out.println(num1 + 1); // 123 + 1 = 124

        String dec = "10.5";
        double num2 = Double.parseDouble(dec);
        System.out.println(num2/2);

        System.out.println("-----------------------------------------");
        // finding max and min in a class

        int max = Integer.MAX_VALUE;
        int min = Integer.MIN_VALUE;
        System.out.println("Max is " + max);
        System.out.println("Min is " + min);

        System.out.println("-----------------------------------------");
        long max2 = Long.MAX_VALUE;
        long min2 = Long.MIN_VALUE;
        System.out.println("Max is " + max2);
        System.out.println("Min is " + min2);

        System.out.println("-----------------------------------------");
        String str = "true";
        String str2 = "trrrruuuueee";
        boolean val = Boolean.parseBoolean(str);
        boolean val2 = Boolean.parseBoolean(str2);
        System.out.println(val);
        System.out.println(val2);

        System.out.println("-----------------------------------------");

        //TO GET IT TO A WRAPPER CLASS, use valueOf

        String nums = "12345";
        Integer numss= Integer.valueOf(nums);
        System.out.println(numss);

        System.out.println("-----------------------------------------");



    }
}
