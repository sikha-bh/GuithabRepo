public class Target {
    public static void main(String[] args) {
        int[] arr = {3, 7, 1, 9, 5};
        int target1 = 6;
        int target2 = 1;

        boolean found1 = false;
        boolean found2 = false;

        for (int num : arr) {
            if (num == target1) {
                found1 = true;
            }
            if (num == target2) {
                found2 = true;
            }
        }

        if (found1 && found2) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
}
