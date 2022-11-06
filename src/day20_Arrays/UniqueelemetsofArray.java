package day20_Arrays;
import java.util.Arrays;

public class UniqueelemetsofArray {
    public static void main(String[] args) {

        String [] group = {"java", "java", "python", "C++", "java"};

        for (int j = 0; j < group.length; j++) {  // bir sonraki 0i değiştirticez

        String element  = group[j];   // jdekini atadık
        int count = 0;
        for (int i = 0; i < group.length; i++) {
            if (group[i].equals(element)) {
                    count++;
            }

        }if (count==1) {
                System.out.println(element);
            }
        }

     }

   

}
