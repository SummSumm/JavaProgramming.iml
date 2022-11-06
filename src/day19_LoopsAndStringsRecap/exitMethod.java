package day19_LoopsAndStringsRecap;

public class exitMethod {
    public static void main(String[] args) {

        for (int i = 0; i < 5; i++) {
            if (i==3) {

                continue; // it skips 3 now
                // break; // only breaks the condition/loop
                // System.exit(0); //terminates everything after itself
            }
            System.out.println(i);

        }
    }
}
