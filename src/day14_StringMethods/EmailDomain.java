package day14_StringMethods;

public class EmailDomain {
    public static void main(String[] args) {

        String email = "sumeyyegoksu@gmail.com";

        String domain = email.substring((email.indexOf("@")+1), (email.lastIndexOf(".")));
        System.out.println(domain);
        System.out.println("----------------------------------------------------");

        String sentence = "Java is fun, Java is cool";

        int J = 0;
        int n = sentence.indexOf(",");
        String first = sentence.substring(0,n);
        String second = sentence.substring((n+2));
        System.out.println(first);
        System.out.println(second);
        System.out.println("----------------------------------------------------");
    }
}
