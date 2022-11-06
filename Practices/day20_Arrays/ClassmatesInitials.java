package day20_Arrays;

public class ClassmatesInitials {
    public static void main(String[] args) {

        String [] classmates = {"Liam Olivia", "Noah Emma", "Oliver Ava", "Elijah Charlotte", "William Sophia", "James Amelia",
            "Lucas Mia", "Henry Evelyn", "Benjamin Isabella", "Alexander Harper"};
        String eachName= "";
        String names = "";

        for (int i = 0; i < classmates.length; i++) {
            eachName = classmates[i];
            for (int j = 0; j < eachName.length(); j++) {

            }
            System.out.println("" + eachName.charAt(0) + "." + eachName.charAt(eachName.indexOf(" ")+1) + ".");
        }

        /*
        for (String classmate : classmates) {
            System.out.println(classmate.substring(0,1) + "." + classmate.charAt(classmate.indexOf(" ") + 1) + ".");
        }*/

    }
}
