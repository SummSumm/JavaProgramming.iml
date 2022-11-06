package day10_;

public class Day10_GradeLevel {
    public static void main(String[] args) {

        byte GradeLevel = 52;
        boolean valid = GradeLevel > 0 && GradeLevel < 19;

        if (valid) {
            if (GradeLevel >= 1 && GradeLevel < 6) {
                System.out.println("Elementary School");
            } else if (GradeLevel >= 6 && GradeLevel < 9) {
                System.out.println("Middle School");
            } else if (GradeLevel >= 9 && GradeLevel < 13) {
                System.out.println("High School");
            } else if (GradeLevel>=13&&GradeLevel<17) {
                System.out.println("College");
            }else {
                System.out.println("Grad School");
            }


            } else {
                System.out.println("Invalid Grade Level");
            }


        }
    }


/*
1. Create a class called GradeLevel, Given a number(byte) grade level determine and print which school type someone is in.
            grade level and types are:
                    1-5: Elementary school
                    6-8: Middle school
                    9-12: High school
                    13-16: College
                    17-18: Grad School

                    For Any Other grade: Invalid grade level given

            NOTE: MUST USE NESTED IF. DO NOT USE MORE THAN ONE PRINT STATEMENT
 */