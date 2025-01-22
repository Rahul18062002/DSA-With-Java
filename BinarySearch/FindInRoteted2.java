public class FindInRoteted2 {

    public static boolean search(int[] nums, int target) {

        int low = 0, high = nums.length - 1;
        while (low <= high) {

            int mid = low + (high - low) / 2;

            if (nums[mid] == target) {
                return true;
            }
            // This case is usefull when duplicat elements are there
            if ((nums[mid] == nums[low]) && (nums[mid] == nums[high])) {
                low = low + 1;
                high = high - 1;
                continue;
            }
            if (nums[mid] >= nums[low]) {

                if (nums[mid] >= target && nums[low] <= target) {
                    high = mid - 1;
                } else {
                    low = mid + 1;
                }
            } else {

                if (nums[mid] <= target && nums[high] >= target) {
                    low = mid + 1;
                } else {
                    high = mid - 1;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {

        int arr[] = { 2, 5, 6, 0, 0, 1, 2 };

        System.out.println(search(arr, 0));
    }
}