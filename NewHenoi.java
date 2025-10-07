public class NewHenoi {
    static int count = 0;

    public static void towerOfhanoi(int n, String scr, String helpher, String dest) {


        if (n == 1) {
            count++;
            System.out.println("transfer disk" + n + "from" + scr + "to" + dest);
            return;
        }
        towerOfhanoi(n - 1, scr, dest, helpher);
        count++;
        System.out.println("transfer disk" + n + "from" + scr + "to" + dest);
        towerOfhanoi(n - 1, helpher, scr, dest);
        System.out.println();
    }

    public static void main(String[] args) {

        int n = 8;
        towerOfhanoi(n, "S", "H", "D");
        System.out.println("\n total moves" + count);
    }
}

