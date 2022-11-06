package day21_Array_For_Each;

public class Initials {
    public static void main(String[] args) {

        String names [] = {"Volvo V40", "BMW g20", "Ford Fiesta", "Mazda g54"};

        for (String each: names) {
            String initials = each.charAt(0) + "." + (each.charAt(each.indexOf(" ")+1 ));
            System.out.println(initials);

        }
    }
}
