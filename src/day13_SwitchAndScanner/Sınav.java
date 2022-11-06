package day13_SwitchAndScanner;

public class Sınav {
    public static void main(String[] args) {
        boolean X = true;
        boolean Y = !X == false;
        boolean Z = Y;

        if (X) {
            System.out.println("1");
        }
         if (Y) {
            System.out.println("2");
        }if (Z){
            System.out.println("3");
        }

         int x=10;
         int y= x++;
        System.out.println(x + y);

    }
}
