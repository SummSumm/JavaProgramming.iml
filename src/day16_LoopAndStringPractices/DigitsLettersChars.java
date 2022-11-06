package day16_LoopAndStringPractices;

public class DigitsLettersChars {
    public static void main(String[] args) {
        String str = "Sumeyye12345%&/()A slan";

        //digits
        //letters
        //chars

        String digit = "";
                String letter ="";
                String character ="";

        for (int i = 0; i < str.length(); i++) {

            char chs = str.charAt(i);
            if (chs>='0'&&chs<='9') {// tırnak içine alırsak ASCIIye gerek kalmaz
                digit +=chs;
            }else if (chs>='a'&&chs<='z') {
                letter += chs;
            }else if (chs>='A'&&chs<='Z'){
                letter += chs;
            }else {
                if (chs != ' '){  // spacei ekleme diyoruz
                character+=chs; }
            }


        }

        System.out.println("digits = " + digit);
        System.out.println("letters = " + letter);
        System.out.println("characters = " + character);

    }
}
