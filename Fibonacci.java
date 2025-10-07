public class Fibonacci {
    static int series(int n) {
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        return series(n - 1) + series(n - 2);
    }

    public static void main(String[] args) {
        int terms = 10;
        System.out.println("febonicci series up to" + terms + "terms");
        for (int i = 0; i < terms; i++) {
            System.out.println(series(i) + " ");
        }
    }
}
