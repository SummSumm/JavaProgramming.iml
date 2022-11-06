package day17_WhilLoops;

public class RemoveDuplicates {
    public static void main(String[] args) {
        String str = "AAAABBBCCCCCC";
        String result = "";


        for (char i = str.charAt(0); i < str.length(); i++) {
            String a = "" + str.charAt(i); // "A", "B" diye ayırıyor
            if (str.contains(a)) {  // resulta tek tek koyuyor

                continue; //  aynısı varsa skip
            }

            result += a;// characters are added tot eh result

    }
        System.out.println(result);

    }
}
