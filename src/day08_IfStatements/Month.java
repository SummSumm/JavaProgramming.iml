package day08_IfStatements;

public class Month {
    public static void main(String[] args) {

        int num = 3;

        if (num == 1) {
            System.out.println("January");
        }
        ;
        if (num == 2) {
            System.out.println("February");
        }
        ;

        if (num == 3) {
            System.out.println("March");
        }
        ;
        if (num == 4) {
            System.out.println("April");
        }
        ;

        System.out.println("---------------------------------------------------------------");

        //months with ... days
        int Jan = 1;
        int Feb = 2;
        int March = 3;
        int April = 4;
        int May = 5;
        int June = 6;
        int July = 7;
        int August = 8;
        int September = 9;
        int October = 10;
        int November = 11;
        int December = 12;

        int month = 1;

        if (month == 1) {
            System.out.println("January has 31 days.");
        }
        ;
        if (month == 2) {
            System.out.println("February has 28 days.");
        } ;

        System.out.println("-----------------------------------------------------");
        //another way to do it
        int numm= 9;


        boolean has28days= numm==2;
        boolean has30days= numm==4 ||numm==6 ||numm==9 ||numm==11;
        boolean has31days= numm==1||numm==3||numm==5||numm==7||numm==8||numm==10||numm==12;

        if (has28days){
            System.out.println("28 days");
        }
        if (has30days) {
            System.out.println("30 days");
        }
        if (has31days){
            System.out.println("31 days");
        }
    }

}
