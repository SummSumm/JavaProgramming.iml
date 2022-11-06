package day21_Arrays_ForEach;

public class palindromeCount {
    public static void main(String[] args) {
        String [] names =  {"anna", "level", "Java"};

        int count = 0;

        for (String each : names) {
            String reverse = "";                                    // a new reverse each time
            for (int i = each.length()-1; i >=0 ; i--) {
                reverse+=each.charAt(i);
            }
            if (reverse.equalsIgnoreCase(each)) {
                count++;
            //    System.out.println(each);  -- elemanları da basmasını istersek
            }

           }
        System.out.println(count);
    }
}
/*
  4. write a program that can count how many palindromes in an array of string
        Ex:
            {"anna", "level", "Java"};

            output:
                2

 */