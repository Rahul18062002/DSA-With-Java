import java.util.ArrayList;

public class FindInRoteted {

    public static int search(ArrayList<Integer> arr, int n, int k) {
        
        int low = 0 ,high =n-1;
        while(low<=high){
           
            int mid = low + (high-low)/2;

            if(arr.get(mid) == k){
               return mid;
            }
            if(arr.get(mid) >= arr.get(low)){

                if(arr.get(mid) >= k  && arr.get(low) <= k){
                    high=mid-1;
                }else{
                    low=mid+1;
                }
            }else{

                if(arr.get(mid) <= k  && arr.get(high) >= k){
                    low =mid+1;
                }else{
                    high =mid-1;;
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {

        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(12);
        arr.add(15);
        arr.add(18);
        arr.add(2);
        arr.add(4);

        System.out.println(search(arr, arr.size(), 2));
    }
}