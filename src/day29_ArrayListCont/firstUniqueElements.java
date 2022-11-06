package day29_ArrayListCont;

import java.util.ArrayList;

public class firstUniqueElements {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(3);
        list.add(4);
        list.add(5);

        

        for (Integer each : list) {
            int frequency  =0;
            for (Integer element : list) {
                if (element==each) {
                    frequency++;
                }

                }
            if (frequency==1) {
                System.out.println(each);
                // break;                     --- sadece ilkini gormek için break ver. Hepsini gormek için break verme
               }

        }

        }
    }

