package day07_Operators;

public class RelationalOperators {
    public static void main(String[] args) {
        /*
        All are Boolean so they are either True or False
        Used with numbers:
        1. Greater than >
        2. Greater Equal >=
        3. Less than <
        4. Less equal <=

        Used with both numbers and String
        5. Equal ==
        6. Not equal !=
         */

        boolean result1= 50>100;
        System.out.println("result1 = " + result1);

        boolean result2 = 100>=100;
        System.out.println("result2 = " + result2);

        boolean result3 = 50<100;
        System.out.println("result3 = " + result3);
        
        boolean result4 = 50<=100;
        System.out.println("result4 = " + result4);

        System.out.println("-----------------------------------------------------------------------------");

        int creditScore = 745;
        boolean eligibility = creditScore>=720;
        System.out.println("eligibility = " + eligibility);
        
        int examScore = 59;
        boolean pass = examScore >= 60;
        System.out.println("pass = " + pass);

        System.out.println("------------------------------------------------------------------------------");
        
        int x = 100;
        int y = 200;

        boolean equality = x==y;
        System.out.println("equality = " + equality);
        boolean nonEquality = x!=y;
        System.out.println("nonEquality = " + nonEquality);

        System.out.println("------------------------------------------------------------------------------");

        boolean result11 = "Muhtar" == "Hoca";
        System.out.println("result11 = " + result11); // false- aynı değiller

        boolean result22 = 'a' == 'A';
        System.out.println("result22 = " + result22); // false farklı CHAR

        boolean result33 ="Java"=="java";
        System.out.println("result33 = " + result33); // false cunku baş harfler farklı

        boolean result44 ="Java"!="java";
        System.out.println("result44 = " + result44); // true cunku baş harfler farklı ve eşitSİZlik sorduk
        System.out.println("------------------------------------------------------------------------------");

    }
}
