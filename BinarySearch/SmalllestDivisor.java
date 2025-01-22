public class SmalllestDivisor {

    public static int smallestDivisor(int arr[], int limit) {

        int low = 1, high = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            high = Math.max(high, arr[i]);
        }
        int ans= -1;

        while (low <= high) {

            int mid = low + (high - low) / 2;
            int findSum = calcSum(arr, mid);
            if (findSum <= limit) {
                ans=mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return ans;
    }

    public static int calcSum(int[] arr, int n) {

        int sum = 0;
        for (int i : arr) {
            sum = sum + (int) Math.ceil((double) i / n);
        }
        return sum;
    }

    public static void main(String[] args) {

        int arr[] = { 2, 3, 5, 7, 11 };
        int limit = 11;
        System.out.println(smallestDivisor(arr, limit)); // 3
    }
}
