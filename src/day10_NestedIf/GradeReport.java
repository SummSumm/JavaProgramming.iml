package day10_NestedIf;

public class GradeReport {
    public static void main(String[] args) {
        int score=80;

        if(score<=100&&score>=0){
            if (score<=100&&score>=90) {
                System.out.println("Excellent");
            }else if (score<=89&&score>79) {
                System.out.println("Great");
            }else if (score<=79&&score>69) {
                System.out.println("Good");
            }else if (score<=69&&score>59) {
                    System.out.println("Passed");
                }else {
                System.out.println("Failed");
            }

        } else {
            System.out.println("Invalid score");
        }
    }
}

/*SHORTCUT for Sting/sout

String result = "";
Sonra her ifadede
if(score<=100&&score>=0){
            if (score<=100&&score>=90) {
                result="Excellent";
            }else if (score<=89&&score>79) {
                result ="Great";

                Şeklinde gidebilirsin
*/