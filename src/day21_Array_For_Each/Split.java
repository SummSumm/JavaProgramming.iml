package day21_Array_For_Each;
import java.util.Arrays;
public class Split {
    public static void main(String[] args) {

        String sentence = "Wooden Spoon";
        String [] words = sentence.split(" ");
        System.out.println(sentence); // çünkü arraylemedik

        System.out.println(Arrays.toString(words)); // ayrı ayrı çıkacak

        System.out.println("**************************************");
        String email = "hello@hotmail.com";
        String [] emailSplit = email.split("@");
        System.out.println(Arrays.toString(emailSplit));

    }
}
