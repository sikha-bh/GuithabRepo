public class Factorial {
    static int fac(int n) {
        if (n == 0) {
            return 1;
        }
        return n * (n - 1);
    }

    public static void main(String[] args) {
        int n = 5;
        int result = fac(n);
        System.out.println("factorial of " +n+" is "   + result );
    }
}
