public class delete {
    public static void main(String[] args) {
        int[] arr = new int[5];
        arr[0]=1;arr[1]=2;arr[2]=3;arr[3]=4;arr[4]=5;
        int n=5,x=2;
        n=del(arr,n,x);
        for(int i=0;i<n;i++){
            System.out.println(arr[i]);
        }
    }
    static int del(int[] arr,int n, int x){
        int i;
        for(i=0;i<n;i++){
            if(arr[i] == x){
                break;
            }
        }
        if(i==n){
            return n;
        }
        for(int j=i;j<n-1;j++){
            arr[j] = arr[j+1];
        }
        return (n-1);
    }
}
