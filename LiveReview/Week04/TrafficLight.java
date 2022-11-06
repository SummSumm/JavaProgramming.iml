package Week04;

public class TrafficLight {
    public static void main(String[] args) {

        char color = 'R';

        switch (color) {
            case 'R': case 'r':
                System.out.println("STOP");
                break;
            case 'Y': case 'y':
                System.out.println("WAIT");
                break;
            case 'G': case 'g':
                System.out.println("GO");
                break;
            default:
                System.out.println("Invalid color");
                break;


        }
    }
}
