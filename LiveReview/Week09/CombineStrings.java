package Week09;

public class CombineStrings {
    public static void main(String[] args) {

        System.out.println(combination("abc", "defg"));



    }
    public static String combination (String str1, String str2) {

        String combined = "";
        int biggersized = str1.length()>str2.length()? str1.length() : str2.length();

        for (int i = 0; i < biggersized; i++) {
            if (i<str1.length()) {                        // bu iflerin herbiri forun içerisinde oldugu için bi birine bakacak bi diğerine bakacak
                combined += str1.charAt(i);
            }
            if (i<str2.length()) {
                combined += str2.charAt(i);
            }
        }
        return combined;
    }
}
