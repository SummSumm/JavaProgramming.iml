package day24_CustomMethods_Return;

public class RemoveDuplicates {
    public static void main(String[] args) {

        String str = "aabbccd";

        str = duplicatesGone(str);

        System.out.println(str);

    }

    public static String duplicatesGone (String str) {
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            char each = str.charAt(i);

            if (result.contains(each + "")) {
                result = str.replace(each, ' ');
            }

        }
        return result;

    }
}
