package day08_If;

public class GradeLevel {
    public static void main(String[] args) {

        byte classNo = -4;


        if (classNo > 0 && classNo < 19) {
            if (classNo > 0 && classNo < 6) {
                System.out.println("Elementary School");
            } else if (classNo > 5 && classNo < 9) {
                System.out.println("Middle School");
            } else if (classNo > 8 && classNo < 13) {
                System.out.println("High School");
            } else if (classNo > 12 && classNo < 17) {
                System.out.println("College");
            } else {
                System.out.println("Grad School");
            }


        } else {
            System.out.println("invalid number");
        }

    }
}
