package Assignment1.Series;

import java.util.Scanner;


public class AlternatingSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            if (i % 2 != 0) System.out.print(i);
            else System.out.print("-" + i);
            
            if (i < n) System.out.print( (i+1)%2==0 ? " " : " + ");
        }
        System.out.println();
        sc.close();
    }
}
