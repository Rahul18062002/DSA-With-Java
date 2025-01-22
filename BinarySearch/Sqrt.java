public class Sqrt {

    public static int sqrtN(long N) {

        if ( N == 0 ) {
            return 0;
        }
        int low = 0;
        int high = (int) N;
        int ans = 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if ((long) (mid * mid) <= N) {
                ans = mid;
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        long num = 35;
        System.out.println(sqrtN(num));
    }
}