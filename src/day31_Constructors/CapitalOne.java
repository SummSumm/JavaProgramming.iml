package day31_Constructors;

public class CapitalOne {
    public static void main(String[] args) {
        BankAccount account1 = new BankAccount();
        account1.setInfo("Jason Derulo", 154879);

        account1.deposit(1000);
        account1.withdraw(50);
        account1.deposit(450);
        account1.checkBalance();

        System.out.println("--------------------------------");

        BankAccount account2 = new BankAccount();
        account2.setInfo("Katy Perry", 123025);
        account2.deposit(20000);
        account2.withdraw(15000);
        account2.checkBalance();
    }
}
