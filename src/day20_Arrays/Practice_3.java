package day20_Arrays;

public class Practice_3 {
    public static void main(String[] args) {

        // "for each" is only used with data structures
       int [] arr1 = {1,2,3,4,5};

        int [] arr2= {4,5,6,7,8};

        for (int each : arr1) {
            for (int each1 : arr2) {
                if (each==each1) {
                    System.out.print(each + " ");

                }

            }

        }
        System.out.println();
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
               if (arr1[i] == arr2 [j]) {
                   System.out.print(arr1[i] + " ");
               }

            }
        }

            }
}
/*
	3. Write a program that can print out the common elements from two integer array
          Ex:
              arr1: {1,2,3,4,5}
              arr2: {4,5,6,7,8}
          output:
              4 5
          MUST use for each loops
 */