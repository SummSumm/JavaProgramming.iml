package day14_StringMethods;

public class StringMethods3 {
    public static void main(String[] args) {


        String word1 = "Cydeo School";

        String word2 = word1.substring(0,5);
        System.out.println(word2);

        String word3 = word1.substring(6);
        System.out.println(word3);
        System.out.println("----------------------------------------------------");

        String str = "Java Programming Language";
        int first = str.indexOf("Java");
        int firstEnd = str.indexOf("a ");
        int second = str.indexOf("Programming");
        int secondEnd=str.indexOf("g ");
        int third = str.indexOf("Language");
        int thirdEnd = str.lastIndexOf("g");

        System.out.println(first +"-"+firstEnd+"-"+ second +"-"+ secondEnd + "-" + third + "-" + thirdEnd);

        String Java = str.substring(0,4);
        String Programming = str.substring(5,16);
        String Language = str.substring(17);

        System.out.println(Java);
        System.out.println(Programming);
        System.out.println(Language);
        System.out.println("-----------------------------------------------------------");

        //Another way

        String sentence = "Java Programming Language";
        String word11 = sentence.substring(0, sentence.indexOf(" "));
        String word22 = sentence.substring(sentence.indexOf(" ")+1, sentence.lastIndexOf(" "));
        String word33 = sentence.substring(sentence.lastIndexOf(" ")+1);

        System.out.println(word11);
        System.out.println(word22);
        System.out.println(word33);
    }
}
