package day08_IfStatements;

public class SalaryCalculator {
    public static void main(String[] args) {

        int hourlyRate = 50,
                weeklyHours = 45;
        double stateTaxRate=0.065,
                federalTaxRate=0.262;

        int  salaryBeforeTax = hourlyRate*weeklyHours*52;
        double stateTax = salaryBeforeTax*stateTaxRate;
        double federalTax= salaryBeforeTax*federalTaxRate;
        double TotalTax= stateTax+federalTax;

        System.out.println("The gross salary is $" + salaryBeforeTax + ".");
        System.out.println("The salary after tax is $" + (salaryBeforeTax-TotalTax));




    }
}
