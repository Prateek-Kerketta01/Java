public class reverse {
    public static void main(String[] args) {
        int arr[] = {34,5,6,10}, n = arr.length;
        rev(arr,n);
        for(int i=0;i<n;i++){
            System.out.print(arr[i] + " ");
        }
    }
    static void rev(int[] arr, int n){
        int low=0, high=n-1;
        while(low<high){
            int temp = arr[low];
            arr[low] = arr[high];
            arr[high] = temp;
            low++;
            high--;
        }
    }
}
