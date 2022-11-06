package day09_IfElse.day15_ForLoops;

public class ForLoopsAlphabet {
    public static void main(String[] args) {
        for (char alp = 65; alp > 64 && alp < 91; alp++) {
            System.out.print(alp);

        }
        System.out.print(" ");
            for (char lower = 97; lower > 96 && lower < 123; lower++) {
                System.out.print(lower);
            }
        }

    }
