import java.util.Scanner;

public class SalaryCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Basic Salary: ");
        double basic = sc.nextDouble();

        System.out.print("Enter Allowances: ");
        double allowances = sc.nextDouble();

        System.out.print("Enter Deductions: ");
        double deductions = sc.nextDouble();

        double netSalary = basic + allowances - deductions;

        System.out.println("Net Salary = " + netSalary);

        sc.close();
    }
}