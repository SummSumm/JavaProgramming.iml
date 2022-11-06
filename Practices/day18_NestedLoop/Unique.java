package day18_NestedLoop;

public class Unique {
    public static void main(String[] args) {
        String a = "aabbcdeef";

        String result ="";


        for (int i = 0; i < a.length(); i++) {
            char ch = a.charAt(i);
            int count = 0;

            for (int j = 0; j < a.length(); j++) {
                char each = a.charAt(j);

                if (ch==each) {
                    count ++;
                }


            }
            if (count==1) {

                result += ch;}
        }
        System.out.println(result);
    }
}
