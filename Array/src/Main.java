public class Main {
    public static void main(String[] args) {
        int arr[] = new int[5], cap=5,n=3;
        arr[0]=5;arr[1]=10;arr[2]=20;
        System.out.println("Before inserting");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+ " ");
        }
        System.out.println();
        int x=7,pos=2;
        n=inset(arr,n,x,cap,pos);
        System.out.println("After insertion");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
    static int inset(int arr[],int n, int x, int cap,int pos){
        if(n==cap){
            return n;
        }
        int idx=pos-1;
        for(int i=n-1;i>=idx;i--){
            arr[i+1] = arr[i];
        }
        arr[idx]=x;
        return n+1;
    }
}