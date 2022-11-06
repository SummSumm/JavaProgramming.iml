package day28_ArrayList;

public class INTERVIEW_StrongPassword2 {
    public static void main(String[] args) {

        String password = "fGh7%&/89";
        int upperC = 0;
        int lowerC = 0;
        int specialC = 0;
        int digitC = 0;

        for (int i = 0; i < password.length(); i++) {
            char each = password.charAt(i);

            if (Character.isUpperCase(each)) {
                upperC++;
            } else if (Character.isLowerCase(each)) {
                lowerC++;
            } else if (Character.isDigit(each)) {
                digitC++;
            } else {
                specialC++;
            }

        }
        boolean strong = password.length() >= 8 && !(password.contains(" ")) && upperC > 0 && lowerC > 0 && specialC > 0 && digitC > 0;
        if (strong) {
            System.out.println("Strong Password");
        } else {
            System.out.println("Not strong password");
        }
    }
}
