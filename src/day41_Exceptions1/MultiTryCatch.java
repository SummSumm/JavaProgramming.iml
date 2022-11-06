package day41_Exceptions1;

import day39_OOPPractices.CydeoTask.Employee;

public class MultiTryCatch {
    public static void main(String[] args) {

        Employee em1 = null;

        try {
            System.out.println(em1.getSalary());
        } catch (IndexOutOfBoundsException e) {
            System.out.println("First catch block");
            e.printStackTrace();
        } catch (ArithmeticException e) {
            System.out.println("Second catch block");
            e.printStackTrace();
        } catch (NullPointerException e) {
            System.out.println("Third catch block");
            e.printStackTrace();
        } catch (RuntimeException e) {
            System.out.println("Fourth catch block");
            e.printStackTrace();
        }
    }
}
