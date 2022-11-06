package Week07;

public class task2 {
    public static void main(String[] args) {

        int col = 0;

        for (int i = 0; i <=6; i++) {  // rows

            for (int j = 1; j <=i ; j++) { // coloumns
                System.out.print(j%2==1? 1 : 0);

            }
            System.out.println();



        }



    }
}
/*
1
1 0
1 0 1
1 0 1 0
1 0 1 0 1
1 0 1 0 1 0

6 rows and 6 coloumns. Odd ones have 1; even ones have 0

 */