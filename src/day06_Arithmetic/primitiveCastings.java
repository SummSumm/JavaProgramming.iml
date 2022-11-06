package day06_Arithmetic;

public class primitiveCastings {
    public static void main(String[] args) {
        byte numbera = 100;
        short numberb = numbera; //short numberb = (short)numbera
        int numberc = (int)numberb; //oradaki intin gri olmasının sebebi otomatik olması
        System.out.println("-----------------------------------------------------------------");
        int a = 100;
        byte b = (byte)a;

        System.out.println("b = " + b);
        System.out.println("------------------------------------------------------------------");
        
        double c = 10.3;
        int d = (int)c; // sadece 10'u alacak; yukarı ya da aşağıya yuvarlamaz.
        System.out.println(d + ":" + c);

        double c1 = 10.3;
        int d1 = (int) c1; // hata veriyorsa alt + enter
        System.out.println(c1 + ":" + d1);
    }



}
