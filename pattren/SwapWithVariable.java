 public class SwapWithVariable {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        System.out.println("Before Swap: a = " + a + ", b = " + b);

        // Logic: Using a 'temp' variable
        int temp = a; // temp now holds 10
        a = b;        // a now holds 20
        b = temp;     // b now holds 10

        System.out.println("After Swap: a = " + a + ", b = " + b);
    }
} 