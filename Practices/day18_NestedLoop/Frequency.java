package day18_NestedLoop;

public class Frequency {
    public static void main(String[] args) {
        String str = "hhdbmaiieoapi";
        String result = "";



        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            int count = 0;
            for (int j = 0; j < str.length(); j++) {
                char each = str.charAt(j);

                if (ch==each) {
                    count ++;
            }
            } // iç for bitiyor

           if (result.contains("" +ch)) {
               continue;
           }
            result += ch;
            result += count;
        }
            System.out.println(result);



    }

}
