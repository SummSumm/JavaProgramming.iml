package Week03;

public class DivisionAndRemainder {
    public static void main(String[] args) {

        int inputSeconds = 451206;
        int hours, min,sec;

        sec=inputSeconds%60;
        min=(inputSeconds/60)%60;
        hours=inputSeconds/3600;

        System.out.println("hours = " + hours);
        System.out.println("min = " + min);
        System.out.println("sec = " + sec);

        String clock = (hours +":"+min+":"+sec);
        System.out.println(clock);

    }
}
