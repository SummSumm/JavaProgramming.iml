package day10_NestedIf;

public class TernariesIntro {
    public static void main(String[] args) {

        int n = 11;

        String result = (n%2==0)? "even" : "odd";
        System.out.println(result);

        System.out.println("------------------------------------");

        int age = 20;
        String result1 = (age>=21)? "eligible" : "not eligible";
        System.out.println(result1);

        /*OR
        int age = 20;
        System.out.println((age>=21)? "eligible" : "not eligible");
         */
        System.out.println("----------------------------------------------------------");

        int num = 0;
        String result3= (num>0)?"positive" : (num<0)? "negative" : "zero";
        System.out.println(result3);
    }
}

/*
if (n%2==0){
            result="even";
            }else if (n%2==1) {
            result = "odd";
        }else {result="Zero";}
        System.out.println(result);
    }
 */
