import java.util.Scanner;

public class avg_02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        double sum = 0;

        System.out.println("Enter numbers:");
        for (int i = 0; i < n; i++) {
            double num = sc.nextDouble();
            sum += num;
        }

        double average = sum / n;

        System.out.println("Average = " + average);

        sc.close();
    }
}