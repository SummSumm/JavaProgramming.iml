package day09_IfContinuation;

public class CharacterIdentity {
    public static void main(String[] args) {
        int n = 45;
        if (n>32&&n<48) {
            System.out.println("Special Character");
        } else if (n>57&&n<160) {
            System.out.println("Special Character");
        } else if (n>47&&n<58) {
            System.out.println("number");
        }
    }
}
/*
4. Create a class called Character Identity, and write a program that can identify if the given character is a digit or Alphabetic Character(A~Z or a~Z) or a special character

		Ex:
			ch = '@'

		output:
			Special Character

		HINT: You may wanna check out the numbers of the chracters on ASCII table
 */