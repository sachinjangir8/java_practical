package Assignment1.Basic;

import java.util.Scanner;


public class SalaryCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Basic Salary: ");
        double basic = sc.nextDouble();
        System.out.print("Enter HRA: ");
        double hra = sc.nextDouble();
        System.out.print("Enter DA: ");
        double da = sc.nextDouble();
        System.out.print("Enter TA: ");
        double ta = sc.nextDouble();
        System.out.print("Enter PF Deductions: ");
        double pf = sc.nextDouble();
        
        double netSalary = basic + hra + da + ta - pf;
        System.out.println("Net Salary: " + netSalary);
        sc.close();
    }
}
