package Assignment1.TwoDArray;

import java.util.Scanner;


public class MatrixMultiplication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter rows and cols for Matrix A: ");
        int r1 = sc.nextInt();
        int c1 = sc.nextInt();
        System.out.print("Enter rows and cols for Matrix B: ");
        int r2 = sc.nextInt();
        int c2 = sc.nextInt();
        
        if (c1 != r2) {
            System.out.println("Multiplication not possible!");
            return;
        }
        
        int[][] a = new int[r1][c1];
        int[][] b = new int[r2][c2];
        int[][] res = new int[r1][c2];
        
        System.out.println("Enter Matrix A:");
        for(int i=0; i<r1; i++) for(int j=0; j<c1; j++) a[i][j] = sc.nextInt();
        System.out.println("Enter Matrix B:");
        for(int i=0; i<r2; i++) for(int j=0; j<c2; j++) b[i][j] = sc.nextInt();
        
        System.out.println("Resultant Matrix:");
        for(int i=0; i<r1; i++) {
            for(int j=0; j<c2; j++) {
                for(int k=0; k<c1; k++) {
                    res[i][j] += a[i][k] * b[k][j];
                }
                System.out.print(res[i][j] + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}
