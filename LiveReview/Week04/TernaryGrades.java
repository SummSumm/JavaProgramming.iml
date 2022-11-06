package Week04;

import org.w3c.dom.ls.LSOutput;

public class TernaryGrades {
    public static void main(String[] args) {

        int score = 1256;

        String result = (score>=60&&score<=100)? "Pass" : (score<0||score>100)? "Invalid Score": "Fail";
        System.out.println("Result: " + result);


        //System.out.println((score>=60&&score<=100)? "Pass":"Fail");
    }
}
