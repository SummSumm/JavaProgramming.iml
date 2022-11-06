package day08_IfStatements;

public class SwapTwoVariables_withTemporaryVariables {
    public static void main(String[] args) {
        int a = 10;
        int b = 15;
        System.out.println("a = " + b);
        System.out.println("b = " + a);

        System.out.println("---------------------------------------");

        int c = b;
        b = a;
        a = c;
        System.out.println("a = " + a);
        System.out.println("b = " + b);
/*
if you do a=b;
b 10 olur
sonra a=b yapsak bile 10 kalırlar
o yuzden temporary var'able laazim ==| c
 */


    }
}
/*
Write a program that can swipe the value of two variables by using a temporary variable.
if a=10, b=15
output:
a=15
b=10
 */