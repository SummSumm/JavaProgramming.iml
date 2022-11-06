package day27_WrapperClasses;

public class SumInString {
    public static void main(String[] args) {

        String s = "aghdkg0472gsöc719";
        int sum = 0;

         for (char each : s.toCharArray()) {
             if (Character.isDigit(each)) {

                 sum += Integer.parseInt(""+ each);//su anda charlar, parse edip string yaptık (o yuzden "" koyduk) ve toplattık

             }
         }
        System.out.println(sum);
    }
}
