public class FirstLastOccurrence {


    public static int firstOccurrence(int[] arr, int target) {
        int left = 0, right = arr.length - 1;
        int result = -1;

        while (left <= right) {
            int mid = (left + right) / 2;

            if (arr[mid] == target) {
                result = mid;
                right = mid - 1;
            } else if (target < arr[mid]) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return result;
    }

    // Function to find last occurrence
    public static int lastOccurrence(int[] arr, int target) {
        int left = 0, right = arr.length - 1;
        int result = -1;

        while (left <= right) {
            int mid = (left + right) / 2;

            if (arr[mid] == target) {
                result = mid;
                left = mid + 1;
            } else if (target < arr[mid]) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] arr = {1,1,2,2,2,2,3,3,4,4,4,5,5,6,6,6,7,7,7};
        int target = 2;

        int first = firstOccurrence(arr, target);
        int last = lastOccurrence(arr, target);

        if (first != -1 && last != -1) {
            System.out.println("First occurrence at index: " + first);
            System.out.println("Last occurrence at index: " + last);
        } else {
            System.out.println("Element not found in array.");
        }
    }
}

