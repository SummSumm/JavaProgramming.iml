package day09_IfElse;

public class PosNegZero {
    public static void main(String[] args) {

        int n =0;

        if (n>0) {
            System.out.println(n + " is positive.");
        }else if (n<0) {
            System.out.println(n + " is negative.");
        }else{ // don't write anything else - the other conditions are already given
            System.out.println(n + " is Zero.");
        }

    }
}
