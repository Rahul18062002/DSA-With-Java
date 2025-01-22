public class SearchInsertPosition {

    public static int insertPosition(int[] arr, int n) {

        int low = 0;
        int high = arr.length - 1;

        while (true) {
            if (low >= high) {
                return (arr[low] < n)? low+1 : low;
            }
            int mid = low + (high - low) / 2;
            if (arr[mid] == n) {
                return mid;
            } else if (arr[mid] > n) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
    }

    public static void main(String[] args) {
        int arr[] = { 1, 3, 5, 6, 8, 9, 23, 46, 57, 89 };
        int element = 56;
        System.out.println(insertPosition(arr, element));
    }
}