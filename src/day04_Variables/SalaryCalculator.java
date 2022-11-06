package day04_Variables;

public class SalaryCalculator {
    public static void main(String[] args) {
// hourlyRate - WeeklyHours
        int HourlyRate = 50;
        int WeeklyHours = 40;
        int Salary = HourlyRate * WeeklyHours * 52;

        System.out.println("HourlyRate = $" + HourlyRate);
        System.out.println("WeeklyHours = " + WeeklyHours);
        System.out.println("Salary = $" + Salary);


    }
}
