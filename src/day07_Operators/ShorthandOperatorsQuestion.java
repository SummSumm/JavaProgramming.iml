package day07_Operators;

public class ShorthandOperatorsQuestion {
    public static void main(String[] args) {
        
        //how many quarters and cents are there in 127 cents?
        
        int num=127;
        int num2 = num%25;
        System.out.println("There are " + num/25 + " quarters and " + num2 + " cents in " + num + ".");
    }
}
