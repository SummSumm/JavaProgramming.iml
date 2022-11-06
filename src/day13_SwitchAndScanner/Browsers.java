package day13_SwitchAndScanner;

public class Browsers {
    public static void main(String[] args) {


String browserName = "123";


        boolean ValidBrowser = browserName == "Firefox" || browserName == "Opera" || browserName == "Safari" || browserName == "Chrome";

        if (ValidBrowser) {
            if (browserName == "Chrome") {
                System.out.println("You are using Chrome");
            } else if (browserName == "Firefox") {
                System.out.println("You are using Firefox");
            } else if (browserName == "Opera") {
                System.out.println("You are using Opera");
            } else {
                System.out.println("You are using Safari");
            }

        }else {
            System.out.println("Invalid Browser name");
        }


    }
}
