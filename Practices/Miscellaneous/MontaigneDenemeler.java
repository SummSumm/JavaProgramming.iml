package Miscellaneous;

import java.util.HashMap;
import java.util.Map;

public class MontaigneDenemeler {

    public static void main(String[] args) {
        String str = "hello world";
        String reversed = "";

        for (int i = str.length()-1; i >= 0; i--) {
            reversed +=str.charAt(i);

        }

        System.out.println(reversed);
    }

}






