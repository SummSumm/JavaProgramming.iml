package day21_Arrays_ForEach;

import java.util.Arrays;

public class CommonOnes {
    public static void main(String[] args) {

        int [] arr1= {1,2,3,4,5};
        int [] arr2= {4,5,6,7,8};
        String commons ="";



        for (int each1 : arr1) {
            for (int each2 : arr2) {
                if (each1==each2) {
                    commons+=each1 + " ";
                }

            }
        }



        System.out.print(commons);
    }
}

// Array olarak çıksın istiyorsak splitten STRING arraye çevirebiliriz.
// Tanımlayalım ve .toStringle basalım

/*
3. Write a program that can print out the common elements from two integer array
          Ex:
              arr1: {1,2,3,4,5}
              arr2: {4,5,6,7,8}

          output:
              4 5


          MUST use for each loops
 */