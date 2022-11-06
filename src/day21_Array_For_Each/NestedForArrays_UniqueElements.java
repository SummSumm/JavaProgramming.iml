package day21_Array_For_Each;
import java.util.Arrays;
public class NestedForArrays_UniqueElements {
    public static void main(String[] args) {

        String[] names = {"Ali", "Ali", "Berrin", "Ceyda", "Ceyda", "Deniz", "Eda", "Eda"};

        for (String each : names) {
            int count=0;
            for (String elements : names) {
                if(elements.equals(each)) {
                    count++;
                }

            }
            if (count==1)
                System.out.println(each);
        }


    }
}