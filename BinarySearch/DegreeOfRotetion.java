
public class DegreeOfRotetion {

    public static int findKRotation(int[] arr) {

        int smallest = Integer.MAX_VALUE;
        int index = -1;
        int low = 0, high = arr.length - 1;

        while (low <= high) {

            int mid = low + (high - low) / 2;

            if (arr[low] <= arr[high]) {

                if(smallest > arr[low]){
                    smallest=arr[low];
                    index = low;
                    break;
                }
            }

            if (arr[mid] >= arr[low]) {

                if(smallest > arr[low]){
                    smallest=arr[low];
                    index = low;
                }
                low = mid + 1;

            } else {

                if(smallest > arr[mid]){
                    smallest=arr[mid];
                    index = mid;
                }
                high = mid - 1;
            }
        }
        return index;
    }

    public static void main(String[] args) {

        int[] arr = { 39, 6, 11, 14, 18, 36, 37, 38 };
        System.out.println(findKRotation(arr));
    }
}
