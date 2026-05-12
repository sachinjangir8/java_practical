package Assignment1.Basic;

import java.util.Scanner;


public class AverageOfNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("How many numbers? ");
        int n = sc.nextInt();
        double sum = 0;
        for (int i = 1; i <= n; i++) {
            System.out.print("Enter number " + i + ": ");
            sum += sc.nextDouble();
        }
        System.out.println("Average: " + (sum / n));
        sc.close();
    }
}
