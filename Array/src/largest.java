public class largest {
    public static void main(String[] args) {
        int arr[]={2,3,11,4,10};
        int i=lar(arr);
        System.out.println("Largest element index "+ i);
        int j=seclar(arr);
        System.out.println("Second largest element index " + j);
    }
    static int lar(int[] arr){
        int n=arr.length;
        int r=0;
        for(int i=1;i<n;i++){
            if(arr[i]>arr[r]){
                r=i;
            }
        }
        return r;
    }
    static int seclar(int[] arr){
        int n=arr.length;
        int r=0;
        for(int i=0;i<n;i++){
            if(arr[i]>arr[r]){
                if(arr[i]<arr[r]){
                    r=i;
                }
            }
        }
        return r;
    }
}
