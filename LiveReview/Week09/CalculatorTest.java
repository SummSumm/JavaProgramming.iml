package Week09;
import Week09.Calculator;                                 //  boyle dersek de alabilir classı yazmalıyız
public class CalculatorTest {
    public static void main(String[] args) {
                                                         //call methods of other classes: WITH CLASS NAME
       double cal1 =  Calculator.add(4,5);
        double cal2 = Calculator.multiply(1,5);
        System.out.println(cal1);
        System.out.println(cal2);
    }
}
