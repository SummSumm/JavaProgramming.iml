package day09_IfElse;

public class MedianNumber {
    public static void main(String[] args) {

        int a = 120;
        int b = 1;
        int c = 20;

        boolean amedian= (a>b && a<c) || (a<b && a>c) ;
        boolean bmedian = (b>a && c>b) || (a>b && c<b);
        boolean cmedian = (c>b && c<a) || (c<b && c>a) ;
        /*
        C için !amedian && !bmedian denilebilir
         */

        if(amedian){
            System.out.println(a + " is the median number.");
        }
        if (bmedian) {
            System.out.println(b+" is the median number.");
        }
        if (cmedian) {
            System.out.println(c+ " is the median number.");
        }


    }
}
