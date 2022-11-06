package day19_LoopsAndStringsRecap;

public class FrequencyofCharacters {
    public static void main(String[] args) {

        String str = "aabbbc";
        char ch = str.charAt(0);
        int count = 0;
        String result = "";


        for (int j = 0; j < str.length(); j++) {
           ch = str.charAt(j);
           count=0;

        for (int i = 0; i < str.length(); i++) {
            char each = str.charAt(i);

            if (ch==each) {
                count++;
            }
            }
            if (result.contains(""+ch)) {
                continue;}
            result += ch;
            result += count;


        }
        System.out.println(result);


    }
}
