package day22_Multidimentional;

import java.util.Arrays;

public class Students {
    public static void main(String[] args) {
        String[] batch25Group1 = {"Jilil", "Aykhan", "Irene", "Yulia", "Muhtar"};
        String[] batch25Group2 = {"Riza", "Allison", "Fei zhou", "Ahmet", "Elena", "Mikael", "Muhtar"};
        String[] batch25Group3 = {"Fady", "Break", "Clock", "Cihad", "Muhtar"};

        String [][] batch25groups = {batch25Group1, batch25Group2, batch25Group3};

        String[] batch24Group1 = {"Fuat", "Kenann", "Aliya", "Anna", "Murodil"};
        String[] batch24Group2 = {"Layla", "Oksana", "Tyler", "Murodil"};
        String[] batch24Group3 = {"Chris", "Yurii", "Mubarek", "Erika", "Subi", "Nadiia", "Murodil"};

        String [][] batch24groups = {batch24Group1, batch24Group2, batch24Group3};

        String [][][] cydeoStudents = {batch24groups, batch25groups};

        //Arrays.deepToString(cydeoStudents);
        //Arrays.toString(cydeoStudents);


        for (String[][] eachbatch : cydeoStudents) {
            for (String[] eachgroup : eachbatch) {
                for (String student : eachgroup) {
                    System.out.print(student + " ");
                }
            }
        }



    }
}
/*
3. CydeoStudents Task:
		2. declare an array variable named batch25Groups with the length of three
				2.1 Assign batch25Group1, batch25Group2, batch25Group1=3 to each indexes of the variable batch25Groups

		3. given the following arrays:
				String[] batch24Group1 = {"Fuat", "Kenann", "Aliya", "Anna", "Murodil"};
		 		String[] batch24Group2 = {"Layla", "Oksana", "Tyler", "Murodil"};
		 		String[] batch24Group3 = {"Chris", "Yurii", "Mubarek", "Erika", "Subi", "Nadiia", "Murodil"};

 		4. declare an array variable named batch24Groups with the length of
 				4.1 Assign batch24Group1, batch24Group2, batch24Group1=3 to each indexes of the variable batch25Groups


		5. declare an array variable named CydeoStudents and assign batch24Groups & batch25Groups to the indexes of CydeoStudents

		6. Print the names of each students

 */