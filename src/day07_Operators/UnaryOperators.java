package day07_Operators;

public class UnaryOperators {
    public static void main(String[] args) {
        
        /*
        + assigns a positive number
        - assigns a negative number
        ++ increases the number by 1
        -- decreases the number by 1
         */
        
        // PRE-INCREMENT and PRE-DECREMENT
        // The value increases-decreases on spot
        
        int a = 25;
        ++a;
        System.out.println("a = " + a);
        
        int b = 25;
        --b;
        System.out.println("b = " + b);
        //Takes it as the last value from here on

        System.out.println(b+2); // 26 çıkmalı bc the last value was 24. It added 2 to it
        
        
        //POST-INCREMENT and POST-DECREMENT
        //Increases and decreases hte value by one on the NEXT STEP
        
        int c = 20;
        System.out.println(c++); // 20 çıktı ama sonraki adımda 21den devam edecek
        System.out.println(c+4); // 25 çıkmalı (21+4)

        int d = 30;
        System.out.println(d--); // aslında su anda 29 ama 30 basacak
        System.out.println(d+3); // artık 29 oldugu için 32 basacak
    }
}
