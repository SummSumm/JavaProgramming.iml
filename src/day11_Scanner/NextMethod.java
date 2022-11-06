package day11_Scanner;
import javax.lang.model.SourceVersion;
import java.util.Scanner;
public class NextMethod {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter Your Name");
        String name = input.next(); // ONLY used for ONE word - until a space

        System.out.println(name);

        System.out.println("-------------------------------------------------------------");

        input.close();


    }
}
