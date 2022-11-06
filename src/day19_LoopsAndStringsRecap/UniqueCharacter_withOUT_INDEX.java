package day19_LoopsAndStringsRecap;

public class UniqueCharacter_withOUT_INDEX {
    public static void main(String[] args) {
        String str = "aabbscjttudg";
        int count = 0;
        String result = "";

        for (int j = 0; j < str.length(); j++) {
            char one = str.charAt(j);
            count = 0;


        for (int i = 0; i < str.length(); i++) {
            char each = str.charAt(i);

            if (one == each) {
                count++;
            }
        }
        if (count==1) {       // or if(!(count==1)) {
            result += one;     // continue;        }
        }

        }

        System.out.println(result);

    }
}
