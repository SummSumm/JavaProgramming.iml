package day31_Constructors;

public class BankAccount {
    public String accountHolder;
    public long accountNo;
    public double balance;

    public void setInfo(String accountHolder, long accountNo) {
        this.accountHolder = accountHolder;
        this.accountNo = accountNo;
    } // balanceı almadık çünkü sadece para oldugunda aktif olsun, hep değil

    public void checkBalance() {
        System.out.println("Your availabla balance is " + balance);
    }
    public void deposit(double deposit) { // bana bu alınacak para lazım
        if (deposit <= 0) {
            System.err.println("Deposit amount cannot be 0 or negative");
            return; // exits the method
        }
        balance+=deposit;
    }
    public void withdraw(double withdraw) { // bana bu alınacak para lazım
        if (withdraw <= 0) {
            System.err.println("Deposit amount cannot be 0 or negative");
            return; // exits the method
        }
        if (withdraw > balance) {
            System.err.println("Insufficient funds");
            return; // exits the method
        }
        balance-=withdraw;
    }

     public String toString() {
        return "BankAccount{" +
                "accountHolder='" + accountHolder + '\'' +
                ", accountNo=" + accountNo +
                ", balance= $" + balance +
                '}';
    }
}
