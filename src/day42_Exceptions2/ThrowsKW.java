package day42_Exceptions2;

public class ThrowsKW {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Test1");

        System.out.println("start");
        for (int i=0; i<=10; i++) {
            System.out.println(i);
            Thread.sleep(500);
        }
        System.out.println("BİTTTTTİİİİİİİ");
    }

}
