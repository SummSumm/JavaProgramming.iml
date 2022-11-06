package Githubdan;

public class Arrays6 {
    public static void main(String[] args) {

        String str = "ACBDHvbn46787^+%&";
        char[] chars = str.toCharArray();

        String specs = "";
        String upperLetters = "";
        String lowerLetters = "";
        String digits = "";

        for (char each : chars) {
            if (Character.isLetter(each)) {
                if (Character.isUpperCase(each)) {
                    upperLetters += each;
                } else {
                    lowerLetters += each;
                }

            } else if (Character.isDigit(each)) {
                digits+=each;
            }else {
                specs += each;
            }
        }
        System.out.println("digits = " + digits);
        System.out.println("lowerLetters = " + lowerLetters);
        System.out.println("upperLetters = " + upperLetters);
        System.out.println("specs = " + specs);
    }
}
