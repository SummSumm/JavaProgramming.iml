package Week07;

import java.util.Random;

public class RandomObject_Password {
    public static void main(String[] args) {
        String source = "QWERTYUIOPASDFGHJKLZXCVBNMqwertyuiopasdfghjklzxcvbnm123456789";
        int length = source.length();


        String password = "";

        Random random = new Random(); // scanner açar gibi random açıyoruz
        for (int i = 1; i < 8; i++) {
            int index = random.nextInt(62);
            password +=source.charAt(index);
            //password += source.charAt(i); // boyle yapsak sırayla sayacağı için QWERTYUI verecek

            
        }
        System.out.println(password);

    }
}
