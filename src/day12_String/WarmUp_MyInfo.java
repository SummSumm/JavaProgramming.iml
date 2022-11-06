package day12_String;
import java.util.Scanner;
public class WarmUp_MyInfo {
    public static void main(String[] args) {

        Scanner input = new Scanner (System.in);

        System.out.println("Enter your age");
        int age = input.nextInt();
        input.nextLine();

        System.out.println("Enter your gender");
        String gender = input.next();
        input.nextLine();

        System.out.println("Enter full name");
        String fullName = input.nextLine();

        System.out.println("Enter your phone number");
        long phone = input.nextLong();
        input.nextLine();

        System.out.println("enter your ZIP code");
        int zip = input.nextInt();
        input.nextLine();

        System.out.println("Enter your school name");
        String school = input.nextLine();

        System.out.println("Enter city name");
        String city = input.nextLine();

        System.out.println("Enter State name");
        String state = input.next();
        input.nextLine();

        System.out.println("Enter building number");
        int building = input.nextInt();
        input.nextLine();

        System.out.println("Enter street name");
        String street = input.nextLine();

        System.out.println("1. Full name = " + fullName);
        System.out.println("2. Age = " + age);
        System.out.println("3. Gender = " + gender);
        System.out.println("4. Phone number = " + phone);
        System.out.println("5. Address: " +  "\n" + building + " " + street + "\n" + city + ", " + state + " " + zip);
        System.out.println("6. School name = " + school);

input.close();

    }
}


/*
1. Create a class called MyInfo. Write a program that can ask the user to:
			1. Enter your age (int)
			2. Enter your gender (String- One word ONLY)
			3. Enter your full name (String- Multiple words)
			4. Enter your phone number (long)
			5. Enter your zip code (int)
			6. Enter your School name (String- Can be Multiple words)
			7. Enter your city name (String- Can be Multiple words)
			8. Enter your state name (String- One word ONLY)
			9. Enter your building number (int)
			10. Enter your Street name

		MAKE SURE USER CAN ENTER ALL THE INPUT

		Display all the inputs that user entered in following order in sperate lines:

			1. full name
			2. age
			3. gender
			4. phone number
			5. address:
						buildingNumber Street
						City, State ZipCode

			6. school name
 */