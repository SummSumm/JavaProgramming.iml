package Week05;
public class EncryptPassword {
    public static void main(String[] args) {

        String pass = "CYDEO";
        char encrypt = 'x';

        String encrypted = "";

        for (int i = 0; i < pass.length(); i++) {
            encrypted +=""+ pass.charAt(i)+encrypt;


        } System.out.println(encrypted);



    }
}
/*
 * 5.
 * Given a string password. Encrypt with "x" a given password
 * and print.
 * (do with for loop)
 * password: cydeo
 * encrypt with char :x
 * output:cxyxdxexox
 */