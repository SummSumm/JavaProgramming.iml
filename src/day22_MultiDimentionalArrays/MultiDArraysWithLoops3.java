package day22_MultiDimentionalArrays;

public class MultiDArraysWithLoops3 {
    public static void main(String[] args) {

        int [][]arr2D = {{1,2,3}, {4,5,6}, {7,8,9}};

        for (int i =0; i <=(arr2D.length)-1 ; i++) {

            for (int j = (arr2D[i].length)-1; j >=0 ; j--) {

                System.out.print((arr2D[i][j]) + " ");
            }
            System.out.println();
            System.out.println("----------------------------");
            for (int k = arr2D.length-1; k >=0 ; k--) {
                for (int l = arr2D[k].length-1; l >=0 ; l--) {
                    System.out.print(arr2D[k][l] + " ");
                }
                System.out.println();
            }
        }
    }
}
