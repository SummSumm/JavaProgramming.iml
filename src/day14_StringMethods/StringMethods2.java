package day14_StringMethods;

public class StringMethods2 {
    public static void main(String[] args) {

        String str = "Java is fun. I love learning Java.";
        str = str.replace("Java", "Python");
        System.out.println(str);
        System.out.println("---------------------------------------------");
        String str2 = "sumeyyegoksu@hotmail.com";
        str2 = str2.replace("hotmail", "gmail");
        System.out.println(str2);
        System.out.println("----------------------------------------------");
        String str3 = "Java Java Python Python C# C# C++ C++ Python Python Python Python";
        str3 = str3.replace("Python", "");
        str3 = str3.replace("  ", "");
        System.out.println(str3);
        System.out.println("----------------------------------------------");
        String str4 = "Java Java Python Python C# C# C++ C++ Python Python Python Python";
        str4 = str4.replaceFirst("Python", "");
        System.out.println(str4);
    }
}
