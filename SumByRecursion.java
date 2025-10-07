public class SumByRecursion {

    // Recursive method to calculate sum of first n natural numbers
    static int sum(int n) {
        if (n == 1) {           // Base case
            return 1;
        }
        return n + sum(n - 1);  // Recursive call
    }

    public static void main(String[] args) {
        int n = 10;               // First 5 natural numbers
        int result = sum(n);     // Call recursive method
        System.out.println("Sum of first " + n + " natural numbers = " + result);
    }
}
