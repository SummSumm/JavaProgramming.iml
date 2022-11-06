package Week09;

public class CustomMethodsPractice {
    public static void main(String[] args) {
        int personage=40;
        eligible(personage);
eligible(65);
eligible(14);
    }

    public static void eligible (int age) {
                if (age>=21) {
            System.out.println("Eligible");
        }else {
            System.out.println("Not Eligible");
        }
    }
}
