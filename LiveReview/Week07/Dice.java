package Week07;
import java.util.Random;
public class Dice {
    public static void main(String[] args) {

        String num = "123456123456";


        Random dice = new Random();

        for (int i = 0; i < 2; i++) {
            int index = dice.nextInt(12);
             char result = num.charAt(index);
            System.out.println(result);



        }

    }
}
