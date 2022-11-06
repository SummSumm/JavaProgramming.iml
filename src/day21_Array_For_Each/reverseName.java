package day21_Array_For_Each;

public class reverseName {
    public static void main(String[] args) {
        String [] names ={"Ayse Akdeniz", "Ece Karci", "Hursit Goksu", "Bilal Goksu", "Bugra Aslan" , "Sumeyye Aslan"};

        for (String each : names) {
            String reverse = "";
            for (int i = each.length()-1; i >= 0 ; i--) {
                reverse +=each.charAt(i);


            }
            System.out.println(reverse);
        }

    }
}
