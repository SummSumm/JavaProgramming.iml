package day13_SwitchAndScanner;

public class Grade {
    public static void main(String[] args) {
        char grade = 'F';

        switch (grade) {
            case 'A':
            case 'B':
            case 'C':
            case 'D':
                System.out.println("Passed");
                break;
            default:
                System.out.println("Failed");

        }
    }
}
