package day19_LoopsAndStringsRecap;

public class UniqueCharacter_withINDEX {
    public static void main(String[] args) {
                            // WITH INDEXOF



        String str = "aabceefggh";
        char ch = str.charAt(0);
        String result = "";

        for (int i = 0; i < str.length(); i++) {
            ch = str.charAt(i);

            if (str.indexOf(ch)==str.lastIndexOf(ch)) {
                result += ch;
            }

        }
        System.out.println(result);

    }
}
