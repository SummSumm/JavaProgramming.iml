package Week08;
import java.util.Arrays;
public class SentenceSplit {
    public static void main(String[] args) {
        String searchresult = "1-16 results of 829 results for ipad";
        //I'll try to find the 829
        //split method kullanacağız --> turns string into String Array

        String [] each = searchresult.split(" "); // --> each space is a splitter point
        System.out.println(Arrays.toString(each)); //  her kelimeyi ayıracak
        String searchamount = each[3];
        System.out.println(searchamount);

        System.out.println("----------------------------");
        String confirmation =  ("Id: 2239677\n" +  "Amount: 790 USD\n"+ "Card Number: 8548595959595\n"+ "Name: oscar\n"+ "Date: 11/10/2021");

        String each2 [] = confirmation.split("\n");
        String searchamount2 = each2[1];

        System.out.println(searchamount2); // cumlenin gerekli kısmı

        String num [] = searchamount2.split(" ");     // cumleyi 3e böldük
        System.out.println(Arrays.toString(num));           // STRINGE CEVİRMELİYİZ
        String sayi = num[1];                               // index 1dekini getir
        //iki kere ayırmaktansa su da oluyor: String each2 [] = confirmation.split("\n").split (" ")[1];
        System.out.println(sayi);                           // çıkar


            }
}
