public class Recursive {

    public static int binarySearch(int[] arr, int target, int low, int high) {

        if (low > high) {
            return -1;
        }
        int mid = low + (high - low) / 2;

        if (arr[mid] == target) {
            return mid;
        } else if (arr[mid] > target) {
            return binarySearch(arr, target, low, mid - 1);
        } else {
            return binarySearch(arr, target, mid + 1, high);
        }
    }

    public static void main(String[] args) {
        int[] arr = { 1, 3, 5, 7, 9, 23, 43, 56, 76, 89, 90 };
        int target = 43;
        System.out.println(binarySearch(arr, target, 0, arr.length - 1));
    }
}