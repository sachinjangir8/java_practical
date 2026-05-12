package Assignment1.String;

import java.util.Scanner;


public class StringPalindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        String reversed = new StringBuilder(str).reverse().toString();
        System.out.println(str.equalsIgnoreCase(reversed) ? "Palindrome" : "Not a Palindrome");
        sc.close();
    }
}
