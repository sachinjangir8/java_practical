package Assignment1.TwoDArray;

import java.util.Scanner;


public class DiagonalSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of square matrix: ");
        int n = sc.nextInt();
        int[][] a = new int[n][n];
        int sum = 0;
        
        System.out.println("Enter Matrix elements:");
        for(int i=0; i<n; i++) {
            for(int j=0; j<n; j++) {
                a[i][j] = sc.nextInt();
                if(i == j) sum += a[i][j];
            }
        }
        System.out.println("Sum of Main Diagonal: " + sum);
        sc.close();
    }
}
