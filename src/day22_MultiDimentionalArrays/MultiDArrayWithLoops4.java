package day22_MultiDimentionalArrays;

public class MultiDArrayWithLoops4 {
    public static void main(String[] args) {

        int [][]arr2D = {{1,2,3}, {4,5,6}, {7,8,9}};
        for (int i = 0; i < arr2D.length; i++) {
            for (int j = arr2D[i].length-1; j >=0 ; j--) {
                System.out.print(arr2D[i][j]  + " ");

            }
            System.out.println();
        }
    }
}
