package day24_CustomMethods_Return;

public class ReturnMethodPractice3 {
    public static void main(String[] args) {
        String str = "aabccdee";
        String result= "";

        for (int i = 0; i < str.length(); i++) {
            int freq = frequency(str, str.charAt(i));

            if (freq==1) {
                result += str.charAt(i);

            }

        }
        System.out.println(result);

    }
    // method
    public static int frequency (String str, char ch ) {

        int count=0;

        for (char each : str.toCharArray()) {
            if (each==ch) {
                count++;
            }

        }
        return count;
    }

   //




}
