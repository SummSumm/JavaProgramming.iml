package day17_WhilLoops;

public class FrequencyChar {
    public static void main(String[] args) {
        String word = "AAAABBBCCD";
        char a = 'A';
        int frequency = 0;


        for (int i = 0; i < word.length(); i++) {
            char eachChar = word.charAt(i);

            if (a == eachChar) {
                frequency++;
            }
        }
                System.out.println(frequency);


        System.out.println("---------------------------------");

        String sent = "Java is Java is Java and Java";
        String w = "Java";
        int freq = 0;

        //sent.substring(0,4)

        for (int i = 0; i < sent.length()-3; i++) {
           String eachString=  sent.substring(i, i+4); //  ama bu out of bounds hatası verir o yuzden yukarıya -3 yazıcaz
            //4 yazardık ama son harfi ignore edeceği için ve ignore etmesini istemediğimiz için 3 yazıcaz

            if (eachString.equals(w)) {
                freq++;
            }

        }System.out.println(freq);



    }
}
