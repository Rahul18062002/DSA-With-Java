public class KokoBanana {

    public static int minimumRateToEatBananas(int[] v, int h) {

        int low = 1, high = findMax(v);

        while (low <= high) {
            int mid = low + (high - low) / 2;

            int totalHours = calcHours(v, mid);

            if (totalHours <= h) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return low;
    }

    public static int calcHours(int[] arr, int h) {

        int total = 0;
        for (int i = 0; i < arr.length; i++) {

            total += Math.ceil((double) arr[i] / (double) h);

        }
        return total;
    }

    public static int findMax(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {

            if (max < arr[i]) {
                max = arr[i];
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int arr[] = { 3, 6, 2, 8 };
        int h = 7;
        System.out.println(minimumRateToEatBananas(arr, h));
    }
}
