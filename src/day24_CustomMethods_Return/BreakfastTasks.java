package day24_CustomMethods_Return;

public class BreakfastTasks {
    public static void main(String[] args) {
        initials("Pera", "Palace");
        domain("hello@hotmail.com");
        String [] emails = {"josh@yahoo.com", "hello@hotmail.com", "gayle@gmail.com"};
        for (String each : emails) {
            domain(each);


            
        }
        givemonths(19);
    }

    public static void initials(String firstName, String lastName) {
// bu concationationı bir Stringe aktarırsan toupperCase de kullanabilirsin

        System.out.println(firstName.charAt(0) + "." + lastName.charAt(0)+".");

    }
    public static void domain(String email) {

        int at = email.indexOf("@");
        String maildomain = email.substring(email.indexOf("@")+1, email.lastIndexOf("."));

        System.out.println(maildomain);


    }
public static void givemonths (int num) {
    String month = "";
    if (num>1 && num<=12) {
        switch (num) {
            case 1:
                System.out.println("Jan");
                break;
            case 2:
                System.out.println("Feb");
                break;
                case 3:
                System.out.println("Mar");
                break;
            case 4:
                System.out.println("Apr");
                break;
            case 5:
                System.out.println("May");
                break;
            case 6:
                System.out.println("Jun");
            break;
                case 7:
                System.out.println("Jul");
                break;
            case 8:
                System.out.println("Aug");
                break;
            case 9:
                System.out.println("Sep");
                break;
            case 10:
                System.out.println("Oct");
                break;
            case 11:
                System.out.println("Nov");
                break;
            case 12:
                System.out.println("Dec");
                break;
        }
    } else
        System.out.println("Invalid number");
}
      



        }



