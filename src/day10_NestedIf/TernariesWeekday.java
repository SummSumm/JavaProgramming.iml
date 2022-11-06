package day10_NestedIf;

public class TernariesWeekday {

    public static void main(String[] args) {

        int n=2;
        System.out.println(n==1? "Monday" : n==2? "Tuesday" : (n==3)? "Wednesday" : (n==4)?"Thursday" : (n==5)? "Friday" : (n==6)? "Saturday" :  "Sunday");

    }

    }

    //ın Terniaries, () are optional, but recommended to use
