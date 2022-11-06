package day12_Scanner;
import java.util.Scanner;
public class MilesKM {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter miles");
        double miles= scan.nextDouble();
        double km = miles*1.60934;

        System.out.println(miles + " miles equals " + km + " kilometres.");
scan.close();
    }
}
