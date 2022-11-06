package day09_IfElse.day15_ForLoops;

public class ForLoopPractice {
    public static void main(String[] args) {
        for (int i = 15; i<46; i++) {
            System.out.print(i + " ");

        }
        System.out.println();
        System.out.println("end");

//        numbers bw 15-45 in the same line with a space in bw

        System.out.println( "------------------------------------------------------------------------");

        // from 100 to 50 on the same line

        for (int i = 100; i>49; i--) {
            System.out.print(i + " ");

        }
        System.out.println("-----------------------------------------------------------------------------");


        //all the even numbers 1-100;

        for(int i= 2; i<100&&1>0; i+=2) {
            System.out.print(i + " ");
        }
    }
}
