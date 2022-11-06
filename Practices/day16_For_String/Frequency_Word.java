package day16_For_String;

public class Frequency_Word {
    public static void main(String[] args) {


    String word = "Java JavaJavaJava Java"; //5
    String j = "Java";
    int count = 0;

        for (int i = 0; i <= word.length()-4; i++) {
            String s = word.substring(i,i+4); // 4lü 4lü ayırıp onların içinde var mı diye bakıyoruz


            if (s.contains("Java")) {
                count++;
            }
        }
        System.out.println(count);


}
}
