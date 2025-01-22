import java.util.ArrayList;

public class FirstAndLastOccurence {

    public static int[] firstAndLastPosition(ArrayList<Integer> arr, int n, int k) {

        int first = firstPosition(arr, n, k);
        if (first == -1) {
            return new int[] { -1, -1 };
        }
        int last = lastPosition(arr, n, k);
        return new int[] { first, last };
    }

    public static int firstPosition(ArrayList<Integer> arr, int n, int k) {

        int first = -1;
        int low = 0, high = n - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr.get(mid) == k) {
                first = mid;
                high = mid - 1;
            } else if (arr.get(mid) > k) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return first;
    }

    public static int lastPosition(ArrayList<Integer> arr, int n, int k) {
        int last = -1;
        int low = 0, high = n - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr.get(mid) == k) {
                last = mid;
                low = mid + 1;
            } else if (arr.get(mid) > k) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return last;
    }

    public static void main(String[] args) {

        ArrayList<Integer> al = new ArrayList<>();
        al.add(1);
        al.add(2);
        al.add(8);
        al.add(8);
        al.add(8);
        al.add(8);
        al.add(10);
        al.add(11);
        al.add(13);

        int n = al.size();
        int target = 8;
        int ans[] = firstAndLastPosition(al, n, target);

        for (int i : ans) {
            System.out.println(i);
        }
    }
}