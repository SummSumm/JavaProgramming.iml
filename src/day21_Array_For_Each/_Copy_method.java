package day21_Array_For_Each;
import java.util.Arrays;
public class _Copy_method {
    public static void main(String[] args) {

        //store the first three names into a new one from a given list

        String [] sts = {"Ahmet" , "Gunay" , "Mediha" , "Bugra"};
        String [] earlybirds = Arrays.copyOf(sts, 2); // arrayden seçicez, SON NOKTA giriyorsun (DAHIL)
        System.out.println(Arrays.toString(earlybirds));


        System.out.println("**********************************");
        char [] chars1 = {'a','b', 'c', 'd', 'e', 'f', 'g', 'h'};
        char [] chars2 = Arrays.copyOfRange(chars1,2,6); // Bu sefer INDEXLER

        System.out.println(Arrays.toString(chars2));

        System.out.println("------------------------------------");
        int [] scores = {10, 20, 30, 40 ,50,60,70,80,90,100};
        int [] scores2 = Arrays.copyOfRange(scores, 3,8);
        System.out.println(Arrays.toString(scores2));



    }
}
