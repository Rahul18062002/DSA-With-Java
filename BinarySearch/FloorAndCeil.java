public class FloorAndCeil {

  public static int[] getFloorAndCeil(int[] a, int n, int x) {

    int low = 0;
    int high = n - 1;
    int ans[] = { -1, -1 };

    while (low < high) {

      int mid = low + (high - low) / 2;
      if (a[mid] == x) {
        ans[0] = ans[1] = a[mid];
        break;
      } else if (a[mid] > x) {
        high = mid - 1;
        ans[1] = a[mid];
      } else {
        low = mid + 1;
        ans[0] = a[mid];
      }
    }
    return ans;
  }

  public static void main(String[] args) {
    int a[] = { 3, 4, 7, 8, 8, 10 };
    int n = 6;
    int x = 7;
    int[] ans = getFloorAndCeil(a, n, x);
    for (int i : ans) {
      System.out.print(i + " ");
    }
  }
}
