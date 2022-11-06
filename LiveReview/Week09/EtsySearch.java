package Week09;

public class EtsySearch {
    public static void main(String[] args) {

        System.out.println("--Starting UI Automation Testing for Etsy--");
openbrowser("Chrome");
navigateToURL("www.etsy.com");
searchForItem("keyboard");
if (verifiedItemIsDisplayed().equalsIgnoreCase("PASS")) {
    System.out.println("Test passed");
} else {
    System.out.println("Test failed");
}


    }

public static void openbrowser(String browser) {
    System.out.println("Launching " + browser + " browser");
}

public static void navigateToURL (String url) {
    System.out.println("Navigating to " + url);
}

public static void searchForItem(String item) {
    System.out.println(item + " exists");
    System.out.println("click on " + item);
}

public static String verifiedItemIsDisplayed () {
        String result = "PASS";
        return result;
}


}
