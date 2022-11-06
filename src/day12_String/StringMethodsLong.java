package day12_String;
public class StringMethodsLong {
    public static void main(String[] args) {

        String s1 = "Batch 25 is the best batch";
        int totalChar = s1.length();

        char last = s1.charAt(totalChar-1);
        System.out.println(last);
    }
}
