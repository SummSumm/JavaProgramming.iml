package day07_Operators;

public class ShorthandOperators {
    public static void main(String[] args) {
        // Her yeni define ettiğimiz satırda en sonki geçerli olur
        int num1 = 100; // this is 100
        num1=200; // num1 is 200 now
        System.out.println(num1+100); // 200+100=300 olmalı

        String word1 = "Java" ; // it's Java now
        word1 = "Class"; // It's Class now
        System.out.println(word1); // Clas basmalı

        //REASSIGNING VALUES
        // = Assignment
        int number1 =100;

        // += Addition Assignment
        int number2 = 200;
        number2 += 50;
        System.out.println("number2 = " + number2); // 200+50= 250 basmalı

        // -= Subtraction Assignment
        int number3 = 300;
        number3 -=50;
        System.out.println("number3 = " + number3); //300-50= 250 basmalı

        // *= Multiplication Assignment
        int number4 = 400;
        number4 *=2;
        System.out.println("number4 = " + number4); // 400*2=800 basmalı

        // /= Division Assignment
        int number5 = 500;
        number5 /=5;
        System.out.println("number5 = " + number5); // 500/5=100 basmalı

        //ALTOGETHER
        int balance = 2000;

        // 200 TL withdrawn
        balance-=200;

        // 500 deposited
        balance += 500;

        System.out.println("balance = " + balance); // hesabın son hali
        
        // her ay boyle olsa 12 ay sonunda: 12 ile çarpalım
        balance*=12;
        System.out.println("balance = " + balance);


        // %= Remainder Assignment and when may we use it
        int number6=100;
        number6 %=9;
        System.out.println("number6 = " + number6); // 1 vermeli


    }
}
