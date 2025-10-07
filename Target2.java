public class Target2 {
    public static void main(String[] args) {
        int arr[] = {1, 1, 2, 3, 4, 5, 6};
        int target = 5;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                System.out.println( "print: true");
            } else {
                System.out.println("false");
            }
        }
    }
}
