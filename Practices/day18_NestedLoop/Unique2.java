package day18_NestedLoop;

public class Unique2 {
    public static void main(String[] args) {

        String word = "volleyball";
        int count = 0;
        String result = "";

        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);
            count=0;
            for (int j = 0; j < word.length(); j++) {
                char each = word.charAt(j);
                if (ch==each) {
                    count++;
                }

            }
            if (count==1) {
                System.out.print(ch);
            }
        }

    }
}
