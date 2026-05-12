package Assignment1.Series;

import java.util.Scanner;


public class EvenSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        for (int i = 2; i <= n; i += 2) {
            System.out.print(i + (i >= n - 1 ? "" : ", "));
        }
        System.out.println();
        sc.close();
    }
}
