package day09_IfElse;

public class LetterGrade {
    public static void main(String[] args) {
        int grade= 84;
        char A ='A', B='B', C='C', D='D', F='F';

        if (grade>0&&grade<60) {
            System.out.println(F);
    }else if (grade>59&&grade<70){
            System.out.println(D);
    }else if (grade>69&&grade<80) {
            System.out.println(C);
        }else if (grade>79&&grade<90) {
            System.out.println(B);
        }else {
            System.out.println(A);
        }
    }
}
