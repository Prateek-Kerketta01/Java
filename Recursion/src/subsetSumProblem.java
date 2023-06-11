public class subsetSumProblem {
    public static void main(String[] args) {
        int n=3, arr[]={10,20,15}, sum=25;
        System.out.println(sum(arr, n, sum));
    }
    static int sum(int[] arr, int n, int sum){
        if(n==0){
            return (sum==0)?1:0;
        }
        return sum(arr, n-1,sum) + sum(arr,n-1,sum-arr[n-1]);
    }
}
