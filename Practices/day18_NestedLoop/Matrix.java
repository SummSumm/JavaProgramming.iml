package day18_NestedLoop;

public class Matrix {
    public static void main(String[] args) {
        for (int i = 1; i < 11; i++) {
             for (int j = 1; j < 11; j++) {
                System.out.print(j*i + "    ");
            }
            System.out.println();
        }
    }

}
