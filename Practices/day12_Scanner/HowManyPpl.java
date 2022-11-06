package day12_Scanner;
import java.util.Scanner;
public class HowManyPpl {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("How many people do you live with?");
        int ppl = scan.nextInt();

        if (ppl>0 && ppl <100) {
        if (ppl < 3) {
            System.out.println("Less than three people");
        } else if (ppl<7) {
            System.out.println("3 to 6 people");
        } else {
            System.out.println("more than 6 people");
        }
    } else {
            System.out.println("Invalid number of people");
        }
        scan.close();
        }
    }

//1. Ask the user how many people they live with:
//            if user lives with Less than 3 people: print "Live with less than 3 people"
//            if the user lives with 3 - 6 people: print "Live with 3 - 6 people"
//            if the user lives with more than 6 people: print "Live with "more than 6 people"