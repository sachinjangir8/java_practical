package Assignment1.Array;

import java.util.Scanner;


public class MaxInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();
        
        int max = arr[0];
        for (int x : arr) if (x > max) max = x;
        
        System.out.println("Maximum: " + max);
        sc.close();
    }
}
