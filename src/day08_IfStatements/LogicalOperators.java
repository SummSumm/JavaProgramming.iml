package day08_IfStatements;

public class LogicalOperators {
    public static void main(String[] args) {

        // to vote on USA
        String name = "Steven";
        int age = 19;
        String citizenship = "USA";

        boolean isEligible = age >= 18 && citizenship == "USA";

        System.out.println(name + " is eligible to vote: " + isEligible);
        System.out.println("-----------------------------------------------------------------------");

        //OR operator
        String name2 = "Bugra";
        int age2 = 35;
        char gender = 'M';

        boolean isEligible2 = age >= 18 && gender == 'F' || gender == 'M';
        System.out.println(name2 + " is eligible to vote: " + isEligible2 + ".");
        System.out.println("-----------------------------------------------------------------------");

        //US citizen

        String name3 = "Bugra";
        String birthPlace = "USA";
        boolean marriedtoUS = false;

        boolean isEligibleUS = birthPlace == "USA" || marriedtoUS == true;
        System.out.println(name3 + " is eligible for US citizenship: " + isEligibleUS + ".");
        System.out.println("-----------------------------------------------------------------------");
// not operator --> !

        int score = 58;
        boolean passed = score>=60;
        boolean failed =!passed;

        System.out.println("The student has passed the exam: " + passed);

    }
}
