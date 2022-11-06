package anil;

public class anilLoops {

    public static void main(String[] args) {

        String a = "hi";
        String b = "bye";
        String c = "hi-bye";


        for (int i = 1; i <= 30; i++) {
             if ((i % 3 == 0) && (i % 5 == 0)) {
                System.out.println(c);
            }else if (i % 3 == 0) {
                System.out.println(a);
            } else if (i % 5 == 0) {
                System.out.println(b);
            }  else
                System.out.println(i);


        }
        String s= "Sevda";
        String reverse = "";
        for (int i = s.length()-1; i >=0 ; i--) {
            reverse += s.charAt(i);
        }
        System.out.println(reverse);
    }
}

