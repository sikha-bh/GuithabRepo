public class OppositNatural {
    void printNumbers(int n) {
        if (n == 0) {
            return;
        }
        System.out.print(n + " ");
        printNumbers(n - 1);

    }

    public static void main(String[] args) {
        int n = 6;
        OppositNatural obj = new OppositNatural();
        System.out.println("First " + n + " natural numbers:");
        obj.printNumbers(n);
    }
}
