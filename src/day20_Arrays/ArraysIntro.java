package day20_Arrays;

import java.util.Arrays;

public class ArraysIntro {
    public static void main(String[] args) {

        // create a variable that can contain 5 names.
        String [] students = new String[5];

        // OR
//        String students [];
        students = new String[5];
        students [0] = "Gunay"; // now the word at index 0 is Gunay
        students [1] = "Mike";
        students [2] = "Fulya";
        students [3] = "Bilal";
        students [4] = "Hursit";


        System.out.println(Arrays.toString(students));  // ilk başta null bc you haven't defined them yet
                                                        // for primitives, you'll see 0

        System.out.println("---------------------------------");

        String [] days = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
        //System.out.println(Arrays.toString(days));

        int num = 5;  // BEŞINCI gunu (Friday) bastırmak istiyorum ama normalde bu index ve Saturdayi basae

        if (num<1 || num>7) {
            System.err.println("Invalid");
            System.exit(0);
        }

        System.out.println(days[num-1]); // -1 demeliyiz ki dogru indexi alsın

        System.out.println("-------------------------------");

        // String [] months = new String[12];

        String [] months = {"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
        int mon=5;

        if(mon<1 || mon>12) {
            System.err.println("Invalid");
            System.exit(0);
        }

        System.out.println(months[mon-1]);
        //TO GET ALL OF THEM
        System.out.println("Months in order");
        for (int i = 0; i < 12; i++) {
            System.out.println(months[i]);
        }
        System.out.println("----------------------------------------");
        System.out.println( "months in reverse order");
        for (int i = months.length-1; i >= 0  ; i--) {
            System.out.println(months[i]);
        }


    }
}
