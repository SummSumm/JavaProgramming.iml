package day42_Exceptions2;

public class DisadvantageThrows {
    
    public static void sleep (double sec) throws InterruptedException {
        Thread. sleep((long)sec*1000);
    }

    public static void main(String[] args) throws InterruptedException {
        sleep(5);
    }
}
