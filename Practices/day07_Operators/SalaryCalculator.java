package day07_Operators;

public class SalaryCalculator  {
    public static void main(String[] args) {
        int hourlyRate = 50;
        int weeklyHours = 45;
        double stateTaxRate= 0.059;
        double federalTaxRate= 0.18;

int SalaryBeforeTax =  hourlyRate*weeklyHours*52;
double stateTax= SalaryBeforeTax*stateTaxRate;
double federalTax = SalaryBeforeTax*federalTaxRate;
double totalTax= stateTax+federalTax;
double salaryAfterTax=SalaryBeforeTax-totalTax;

        System.out.println("Gross Pay is $" + SalaryBeforeTax);
        System.out.println("Federal Tax is $" + federalTax);
        System.out.println("State tax is $" + stateTax);
        System.out.println("Net income is $" + salaryAfterTax);

    }
}

/*
3.1 declare the following variables:
					hourlyRate, weeklyHours, stateTaxRate, federalTaxRate

			3.2 use the given info in above variables to calculate the followings:
					1. salaryBeforeTax
					2. stateTax
					3. federalTax
					4. totalTax
					5. salaryAfterTax

					Hint: salaryBeforeTax = hourlyRate * weeklyHour * 52

			3.3 use print statement to print each of the above
				Ex:
					   hourlyRate = $50
					   weeklyHours = 45
					   stateTaxRate = 6 (given as percentage, you need to convert to decimal)
					   federalTaxRate = 26 (given as percentage, you need to convert to decimal)

				    output:
				    	Gross pay is: $117000
				    	Federal tax is: $30420
			    		State tax is: $7020
			    		Total tax is: $37440
			    		Net income is: 79560
 */