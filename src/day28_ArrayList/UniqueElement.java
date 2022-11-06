package day28_ArrayList;

import java.util.ArrayList;

public class UniqueElement {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Java");
        list.add("Java");
        list.add("Java");
        list.add("Python");
        list.add("C#");
        list.add("C#");
        list.add("C#");
        list.add("Ruby");
        list.add("C++");
        list.add("C++");

        ArrayList<String> uniques = new ArrayList<>();
        for (String each : list) {
            if (list.indexOf(each)==list.lastIndexOf(each)) { // ikisi aynıysa tektir
                uniques.add(each);
            }
        }
        System.out.println(uniques);
    }

}
