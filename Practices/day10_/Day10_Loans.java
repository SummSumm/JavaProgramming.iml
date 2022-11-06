package day10_;

public class Day10_Loans {
    public static void main(String[] args) {
        int Salary = 70000;
        int CreditScore = 4220;

        String result = (Salary>=60000&&CreditScore>650)? "Loan Approved." : "Loan denied.";
        System.out.println(result);


    }
}

/*
6. Create a class called Loans, Given two variables salary and credit score, use those given info to determine if you can get a loan.

                To be approved for the loan, print: "Loan Approved":
                        Salary: above 60,000
                        Credit Score: above 650

                    Otherwise print: "Loan Denied"

              NOTE: MUST USE TERNARY.
 */