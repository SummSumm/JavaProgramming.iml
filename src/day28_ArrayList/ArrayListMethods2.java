package day28_ArrayList;

import java.util.ArrayList;

public class ArrayListMethods2 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        list.add(100);
        list.add(200);
        list.add(300);
        list.add(400);
        list.add(500);

        int num = 1;
        list.remove(1); // ilk 200 gider

        //Integer verirsek kelimenin kendini siler
        Integer n = 300;
        list.remove(n);
        System.out.println(list);

        boolean r = list.remove(n); // remove ettiyse TRUE çıkar. FALSE çünkü başka 300 kalmadı.
        System.out.println(r);
        System.out.println("----------------------------------");

        //remove
        list.clear();
        System.out.println(list);

        System.out.println("------------------------------------");
        //index of and last index of
        ArrayList <Character> characters = new ArrayList<>();

        characters.add('A');
        characters.add('B');
        characters.add('C');
        characters.add('D');
        characters.add('E');
        characters.add('A');

        int a = characters.indexOf('A');
        int b = characters.lastIndexOf('A');
        System.out.println(a);
        System.out.println(b);

    }
}
