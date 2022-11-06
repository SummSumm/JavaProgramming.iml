package day10_NestedIf;

public class NestedTernary {
    public static void main(String[] args) {

//only one statements can turn into ternaries - Possible to do but NOT RECOMMENDED - Not readable
        int score = 840;

       String result= (score >= 0 && score <= 100)?  (score >= 60) ? "Passed": "Failed" : "The score is invalid.";
        System.out.println(result);

        //Preconditions first and the rest of the nested can be ternary if you'd like
        //Let's try the days of the week one
        System.out.println("************************************************************************");
        int n=8;
        String days = (n<=7&&n>0)? (n==1)? "Monday" : n==2? "Tuesday" : (n==3)? "Wednesday" : (n==4)?"Thursday" : (n==5)? "Friday" : (n==6)? "Saturday" :  "Sunday" : "Invalid number";
        System.out.println(days);

        System.out.println("************************************************************************");

        int nn=5;
        String result2 = "";
        if (nn<=7&&nn>0) {
            result2= (nn == 1) ? "Monday" : nn == 2 ? "Tuesday" : (nn == 3) ? "Wednesday" : (nn == 4) ? "Thursday" : (nn == 5) ? "Friday" : (nn == 6) ? "Saturday" : "Sunday";
        } else {result2 = "Invalid number";}
        System.out.println(result2);

    }

    }
