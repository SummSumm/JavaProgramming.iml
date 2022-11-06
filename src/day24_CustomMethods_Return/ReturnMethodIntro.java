package day24_CustomMethods_Return;

public class ReturnMethodIntro {
    public static void main(String[] args) {

        String str = "Java";
        String result = reverse(str);

        System.out.println(result);

        if (result.equalsIgnoreCase(str)) {
            System.out.println("palindrome");
        } else {
            System.out.println("not palindrome");
        }


    }


    public static String reverse (String word) {
        String reversed = "";

        for (int i = word.length()-1; i >=0; i--) {
            reversed += word.charAt(i);

        }
        return reversed;
    }
}
