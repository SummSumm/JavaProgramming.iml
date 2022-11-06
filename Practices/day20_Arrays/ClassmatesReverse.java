package day20_Arrays;

public class ClassmatesReverse {
    public static void main(String[] args) {
        String [] classmates = {"Liam", "Noah", "Oliver", "Elijah", "William", "Jame",
                "Lucas", "Henry", "Benjamin", "Alexander"};
        String names = "";

        for (int i = 0; i < classmates.length; i++) {
            names = classmates[i] + " ";
            String reversed= "";
            for (int j = names.length()-1; j >=0 ; j--) {
                char ch = names.charAt(j);
                reversed +=ch;

            }
            System.out.println(reversed + " ");
        }

        System.out.println();

/*

        for (String classmate : classmates) {
            String eachReverse = "";
            for (int i = classmate.length()-1; i >=0 ; i--) {
                eachReverse += classmate.charAt(i);

            }
            System.out.println(eachReverse);
        }

 */

    }
}
//2. create string array, and store the names of your  class mates (10)
//            reverse each students names and print them in separate lines
//            	ex:
//            		arr = {java, python, c#}
//
//        		output:
//        			avaJ
//        			nohtyp
//        			#c