package day20_Arrays;
import java.lang.reflect.Array;
import java.util.Arrays;
public class ArraysWITHLoops {
    public static void main(String[] args) {
        char [] letters = new char [26];


        // CHAR yaptık!!!! Ama int olsa da olurdu çünkü ASCII numarasından çekecekti
        for (char i = 'A', j=0; i <= 'Z' && j< letters.length; i++, j++) {     // İlk once boyleydi: for (char i = 'A'; i <= 'Z'; i++) bu harfleri belirliyor
            letters[j] = i;                                    // ama Arrayde değil. Alfabeden başka bişey için zor. Arraye çevirmek için bir de [] içine gelecek sayıyı/indexi artırmalıyız

        }
        System.out.println(Arrays.toString(letters));

        System.out.println("----------------------");
        // aynısını tek variablela da yapabiliriz
        
        char ch = 'a';
        for (int i = 0; i < letters.length; i++) {
            letters [i] = ch++;
            
        }
        System.out.println(Arrays.toString(letters));

        System.out.println("--------------------------");
        System.out.println("Backwards");

        char [] alp = new char[26];


        char chh = 'z';

        for (int i = 0 ; i <alp.length; i++, chh--) {// bunun küçülmesi lazım ama indexin artmasi lazım
            alp[i] =chh;

            // OR  for (char i = 0, j= 'z'; i <alp.length; i++, j--)
            // alp[i] =j;

        }
        System.out.println(Arrays.toString(alp));


    }
}
