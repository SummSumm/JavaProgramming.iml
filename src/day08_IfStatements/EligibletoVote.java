package day08_IfStatements;

public class EligibletoVote {
    public static void main(String[] args) {

        String name = "Chris";
        int age = 11;
        String citizenship = "USA";

        boolean isEligible = age >= 18 && citizenship == "USA";

        if (isEligible) {
            System.out.println(name + " is eligible to vote.");
        }

        if (!isEligible) {
            System.out.println(name + " is not eligible to vote.");
        }


    }
}
