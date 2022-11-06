package day13_SwitchAndScanner;

public class SwitchChar {
    public static void main(String[] args) {

        char grade = 'K';

        switch (grade) {
            case 'A':
                System.out.println("Excellent");
                break;
            case 'B':
                System.out.println("Great");
                break;
            case 'C':
                System.out.println("Good");
                break;
            case 'D':
                System.out.println("Pass");
                break;
            case'F':
                System.out.println("Failed");
                break;
            default:
        }
    }
}
