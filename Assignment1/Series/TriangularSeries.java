package Assignment1.Series;

import java.util.Scanner;


public class TriangularSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        int current = 0;
        for (int i = 1; ; i++) {
            current += i;
            if (current > n) break;
            System.out.print(current + " ");
        }
        System.out.println();
        sc.close();
    }
}
