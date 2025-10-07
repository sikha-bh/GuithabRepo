public class PeakElement {
    public static int findPeakElement(int[] arr) {
        int low = 0, high = arr.length - 1;

        while (low < high) {
            int mid = (low + high) / 2;

            if (arr[mid] < arr[mid + 1]) {
                low = mid + 1;
            } else {
                high = mid;
            }
        }


        return low;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 1, 3, 5, 6, 4};

        int peakIndex = findPeakElement(nums);
        System.out.println("Peak element found at index: " + peakIndex);
        System.out.println("Peak element is: " + nums[peakIndex]);
    }
}
