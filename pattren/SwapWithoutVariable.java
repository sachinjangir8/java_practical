public class SwapWithoutVariable {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        System.out.println("Before Swap: a = " + a + ", b = " + b);

        // Logic: Arithmetic operations
        a = a + b; // a becomes 30 (10 + 20)
        b = a - b; // b becomes 10 (30 - 20)
        a = a - b; // a becomes 20 (30 - 10)

        System.out.println("After Swap: a = " + a + ", b = " + b);
    }
}