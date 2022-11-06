package day14_StringMethods;

public class StringMethods1 {
    public static void main(String[] args) {

        // trim deletes white spaces BUT needs to be redefined

        String str = "     Hello World    ";
        str = str.trim();

        System.out.println(str);

        System.out.println("-----------------------------------------------");
        String str2 = "Cydeo SChool";
        int n1 = str2.indexOf("h");
        System.out.println(n1);

        //what about the o s? there are 3 --> Give a string of letters, it will check the first

        int n2 = str2.indexOf("ool");
        System.out.println(n2);

    }
}
