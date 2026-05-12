package Assignment1.Number;

import java.util.Scanner;


public class SumOfCubesOfDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        int sum = 0;
        while (n != 0) {
            int d = n % 10;
            sum += d * d * d;
            n /= 10;
        }
        System.out.println("Sum of cubes of digits: " + sum);
        sc.close();
    }
}
