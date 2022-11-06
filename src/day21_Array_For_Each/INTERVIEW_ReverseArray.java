package day21_Array_For_Each;

import java.util.Arrays;

public class INTERVIEW_ReverseArray {
    public static void main(String[] args) {

        int [] num = {10,20,30,40,50,60};

       int [] reversed = new int [num.length]; // bunu yapmak zorundayoz. Sınırı çiziyoruz
        //reversed [0] = num[num.length-1];
        //reversed [1] = num[4];
        //reversed [2] = num [3];
        //... boyle gitmeli
        //System.out.println(Arrays.toString(reversed));
        //System.out.println("***********************************");
        //System.out.println("ANOTHER WAY with for");

        for (int i = num.length-1, j=0; i >= 0; i--, j++) {
            reversed[j] = num [i];

        }
        System.out.println(Arrays.toString(reversed));

    }
}
