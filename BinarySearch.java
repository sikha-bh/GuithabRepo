public class BinarySearch {

    public static int search(int[] array, int target, int left, int right) {
        if (right < left) {
            return -1;
        }

        int middle = (left + right) / 2;

        if (array[middle] == target) {
            return middle;
        } else if (target > array[middle]) {
            return search(array, target, middle + 1, right);
        } else {
            return search(array, target, left, middle - 1);
        }
    }

    public static void main(String[] args) {
        int[] array = {2, 4, 6, 8, 10, 12, 14};
        int target = 10;

        int result = search(array, target, 0, array.length - 1);

        if (result != -1) {
            System.out.println("Element found at index: " + result);
        } else {
            System.out.println("Element not found in array.");
        }
    }
}
