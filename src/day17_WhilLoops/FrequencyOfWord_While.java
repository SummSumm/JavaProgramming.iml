package day17_WhilLoops;

import org.w3c.dom.ls.LSOutput;

public class FrequencyOfWord_While {
    public static void main(String[] args) {

String sentence = "Java is Java is Java is Java and Java";
int frequency = 0;

while(sentence.contains("Java")) {
    sentence = sentence.replaceFirst("Java", "");
    frequency++;
}
        System.out.println(frequency);


        System.out.println("--------------------------------");

        String st = "CAT CAT DOG BORD CAT BIRD";
        int freq = 0;
        while (st.contains("CAT")) {
            st = st.replaceFirst("CAT", "");
            freq++;
        }
        System.out.println(freq);
    }

}

