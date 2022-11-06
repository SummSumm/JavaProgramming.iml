package day13_SwitchAndScanner;

public class Months {
    public static void main(String[] args) {
        int year = 2002;
        int month = 2;
        boolean valid = month >= 1 && month <= 12;


        if (valid) {
            switch (month) {
                case 2:
                    if (year % 4 == 0) {
                        System.out.println("29 days");
                    } else {
                        System.out.println("28 days");
                    }
                    break;
                case 1:
                case 3:
                case 5:
                case 7:
                case 8:
                case 10:
                case 12: {
                    System.out.println("31 days");
                }
                break;
                case 4:
                case 6:
                case 9:
                case 11: {
                    System.out.println("30 days");
                }
                break;
            }


        } else {
            System.out.println("Invalid month");
        }



    }
}