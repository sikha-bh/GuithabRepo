public class NaturalNumber {

    void printNumbers(int n) {
        if (n == 0) {
            return;
        }
        printNumbers(n - 1);
        System.out.print(n + " ");
    }

    public static void main(String[] args) {
        int n = 5;
        NaturalNumber obj = new NaturalNumber();
        System.out.println("First " + n + " natural numbers:");
        obj.printNumbers(n);
    }
}

