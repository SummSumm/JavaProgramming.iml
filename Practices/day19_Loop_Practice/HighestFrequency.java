package day19_Loop_Practice;

public class HighestFrequency {
    public static void main(String[] args) {
        String str= "aaabbc";
        int count = 0;
        int highestFrequency = 0;
        String result = "";

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            count = 0;
            for (int j = 0; j < str.length(); j++) {
                char each = str.charAt(j);
                if (ch==each) {
                    count++;

                }
                if(count > highestFrequency){
                    highestFrequency = count;
                    result = "" + ch + highestFrequency;

            }

            }



        }

        System.out.print(result);



    }
}
