public class second_lar {
    public static void main(String[] args) {
        int arr[]={12,35,1,10,34,1};
        int n = arr.length;
        seclar(arr,n);
    }
    static void seclar(int[] arr, int n){
        int i,second;
        if(n<2){
            System.out.println("Invalid input");
            return;
        }
        int largest = second = Integer.MIN_VALUE;
        for(i=0;i<n;i++){
            largest = Math.max(largest,arr[i]);
        }
        for(i=0;i<n;i++){
            if(arr[i] != largest){
                second = Math.max(second,arr[i]);
            }
        }
        if(second == Integer.MIN_VALUE){
            System.out.println("There is no second larget element");
        }else {
            System.out.println("The second largest element is:- " + second);
        }
    }
}
