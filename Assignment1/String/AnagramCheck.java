package Assignment1.String;

import java.util.Arrays;

import java.util.Scanner;

public class AnagramCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first string: ");
        String s1 = sc.nextLine().toLowerCase();
        System.out.print("Enter second string: ");
        String s2 = sc.nextLine().toLowerCase();
        
        if (s1.length() != s2.length()) {
            System.out.println("Not Anagrams");
        } else {
            char[] c1 = s1.toCharArray();
            char[] c2 = s2.toCharArray();
            Arrays.sort(c1);
            Arrays.sort(c2);
            System.out.println(Arrays.equals(c1, c2) ? "Anagrams" : "Not Anagrams");
        }
        sc.close();
    }
}
