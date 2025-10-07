public class MaxInArray {

    static int findMax(int[] arr, int n) {
        if (n == 1) {
            return arr[0];
        }
        int maxRest = findMax(arr, n - 1);
        return Math.max(arr[n - 1], maxRest);
    }

    public static void main(String[] args) {
        int[] arr = {100, 154, 259, 543, 4862, 458, 258, 952};
        int max = findMax(arr, arr.length);
        System.out.println("Maximum element = " + max);
    }
}
