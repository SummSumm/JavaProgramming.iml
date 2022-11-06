package day08_IfStatements;

public class GradeReport {
    public static void main(String[] args) {

        int score = 59;


        if(score>=90)
        {
            System.out.println("Excellent");
        }
        if(score>=80&&score<=89){
            System.out.println("Great");
        }
        if(score>=70&&score<=79)
        {
            System.out.println("Good");
        }
        if (score>=60&&score<=69){
            System.out.println("Pass");
        }
        if(score<60){
            System.out.println("Fail");
        }
    }
}
/*
100-90 excellent
80-89 great
70-79 good
60-69 pass
0-59 fail
 */

//booleanlara harf atayıp onları da if e koyabilirsin