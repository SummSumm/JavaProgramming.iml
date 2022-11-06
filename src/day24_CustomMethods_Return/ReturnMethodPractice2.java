package day24_CustomMethods_Return;

public class ReturnMethodPractice2 {
    public static void main(String[] args) {
        String str = grades(915);

        // buraya
        if (str.contains("A")) {
            System.out.println("Excellent");
        } else if (str.contains("B")) {
            System.out.println("Great");
        } else if (str.contains("C")) {
            System.out.println("Good");
        } else if (str.contains("D")) {
            System.out.println("Not bad");
        } else if (str.contains("F")){
            System.out.println("Study harder");
        } else {
            System.out.println("Invalid");
        }

    }


    public static String grades (int score) {
              String result = "";

        if (score<0 || score> 100) {
            System.out.println("Invalid");
        } else {
            result = (score>=90) ? "A" : (score>=80) ? "B" : (score>=70)? "C" : (score>=60)? "D" : "F";
        }
        return result;
    }


    }



