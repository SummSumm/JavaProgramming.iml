package day15_Loop;

public class Sum_Factorial {
    public static void main(String[] args) {

        int sum1 = 0;
        int sum2 =1; // FAKTORYEL İÇİN 0 OLMAMASI LAZIM - ÇARPIYORUZ!!!
        for (int i = 0; i < 151; i++) {
            sum1 +=i;

        }System.out.println(sum1);

        for (int j = 1; j < 6; j++) {
            sum2 *= j;

        }System.out.println(sum2);

        System.out.println("--------------------------------");
        String str = "AFby456";

        int sum = 0;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (ch>=48 && ch<=57) {
                sum+=ch-48;    // ASCIIde 48den başladığı için çıkarıcaz

            }

        }
        System.out.println(sum);
    }
}
/*
3. write a program that can calculate the sum of all numbers between 1 to any given number
            ex:
                input: 100
                output: 5050

                input: 50
                output: 1275


	4. Write a program that can return the factorial number of any given number

            Ex:
                input: 5
                output: 120

                	( because: 5! = 5 * 4 * 3 * 2* 1 = 120 )
   6. Write a program that can return the sum of digits from a  string
             Ex:
                 input: A1B2C3

                 output:    6

             Hint: You need to get each of the character by using a loop
	             	To convert char to number:
						             	   '0' - 48   ==> 0
						             	   '1' - 48   ==> 1
						             	   		...
 */