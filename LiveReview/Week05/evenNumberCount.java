package Week05;

public class evenNumberCount {
    public static void main(String[] args) {

        int evencount = 0;

        for (int i = 5; i < 51; i++) {
            if(i%2==0) {
                ++evencount; // Bir şeyin sayısınıartırmak için ++Value kullan
            }


        }
        System.out.println("Count of even numbers = " + evencount);
    }
}
