package Assignment1.PrimeRange;

import java.util.Scanner;


public class PrimeNToK {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        System.out.print("Enter k: ");
        int k = sc.nextInt();
        System.out.println("Prime numbers between " + n + " and " + k + ":");
        for (int i = n; i <= k; i++) {
            if (isPrime(i)) System.out.print(i + " ");
        }
        System.out.println();
        sc.close();
    }
    
    static boolean isPrime(int num) {
        if (num < 2) return false;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) return false;
        }
        return true;
    }
}
