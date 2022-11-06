package day42_Exceptions2;

public class PushUps {
    public static void main(String[] args) {

        System.out.println("Push-up started");

        for (int i = 1; i < 31; i++) {
            System.out.print("\r Push up " + i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println();
        System.out.println("Push-ups complete");

        System.out.println("Pull-ups started");

        for (int i=1; i<21; i++) {

                System.out.println("pull up " + i);
                sleep(1);
        }
        System.out.println("Pull-ups complete");


    }


    public static void sleep (double seconds) {   // şimdi buu yukrıda kullanalım
        try {
            Thread.sleep((long) seconds*1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
