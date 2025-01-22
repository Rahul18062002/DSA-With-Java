public class LowerBound{

    public static int lowerBound(int []arr,int element,int n){

        int low = 0 ;
        int high = n-1;
        int ans=n;
        while(low <= high){

            int mid=low+(high-low)/2;
            if(arr[mid] >= element){
                ans=mid;
                high=mid-1;
            }else{
                low=mid+1;
            }
        }
        return ans;
    }
    public static void main(String []args){
        int []arr = {2,5,8,12,34,45,65,78,98};
        int element = 17;
        System.out.println(lowerBound(arr,element,arr.length));
    }
}