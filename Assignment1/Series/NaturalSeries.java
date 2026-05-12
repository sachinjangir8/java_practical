package Assignment1.Series;

import java.util.Scanner;


public class NaturalSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            System.out.print(i + (i == n ? "" : ", "));
        }
        System.out.println();
        sc.close();
    }
}
