package day31_Constructors;

public class SalaryCalculator {
    public double hourlyRate, stateTaxRate, federalTaxRate;
    public int weeklyHours;

    public SalaryCalculator(double hourlyRate, double stateTaxRate, double federalTaxRate, int weeklyHours) {
        this.hourlyRate = hourlyRate;
        this.stateTaxRate = stateTaxRate;
        this.federalTaxRate = federalTaxRate;
        this.weeklyHours = weeklyHours;
    }

    public double salary() {
        double salary = hourlyRate*weeklyHours*52;
        return salary;
    }

    public double stateTax() {
        double stateTax = salary()*stateTaxRate;
        return stateTax;
    }

    public double federalTax() {
        double federalTax = salary()*federalTaxRate;
        return federalTax;
    }

    public double salaryAfterTax() {
        double salaryAfterTax = salary () - (federalTax()+stateTax());
        return salaryAfterTax;
    }

    public String toString() {
        return "SalaryCalculator{" +
                "hourlyRate=" + hourlyRate +
                ", stateTaxRate=" + stateTaxRate +
                ", federalTaxRate=" + federalTaxRate +
                ", weeklyHours=" + weeklyHours +
                ", salary=" + salary() +
                ", state Tax cut=" + stateTax() +
                ", federal Tax cut =" + federalTax() +
                ", Salary After Tax=" + salaryAfterTax() +
                '}';
    }

}
