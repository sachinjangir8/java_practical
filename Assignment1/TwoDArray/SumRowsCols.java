package Assignment1.TwoDArray;

import java.util.Scanner;


public class SumRowsCols {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter rows and columns: ");
        int r = sc.nextInt();
        int c = sc.nextInt();
        int[][] a = new int[r][c];
        
        System.out.println("Enter Matrix:");
        for(int i=0; i<r; i++) {
            int rowSum = 0;
            for(int j=0; j<c; j++) {
                a[i][j] = sc.nextInt();
                rowSum += a[i][j];
            }
            System.out.println("Sum of row " + (i+1) + ": " + rowSum);
        }
        
        for(int j=0; j<c; j++) {
            int colSum = 0;
            for(int i=0; i<r; i++) colSum += a[i][j];
            System.out.println("Sum of col " + (j+1) + ": " + colSum);
        }
        sc.close();
    }
}
