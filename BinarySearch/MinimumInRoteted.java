public class MinimumInRoteted {

    public static int findMin(int[] nums) {

        int smallest = Integer.MAX_VALUE;
        int low = 0, high = nums.length - 1;

        while (low <= high) {

            int mid = low + (high - low) / 2;

            if(nums[low] <= nums[high]){
                smallest = Math.min(smallest, nums[low]);
                break;
            }

            if (nums[mid] >= nums[low]) {

                smallest = Math.min(smallest, nums[low]);
                low = mid + 1;

            } else {

                smallest = Math.min(smallest, nums[mid]);
                high = mid - 1;
            }
        }

        return smallest;
    }

    public static void main(String[] args) {
        int nums[] = { 4, 5, 6, 7, 0, 1, 2 };
        System.out.println(findMin(nums));
    }
}
