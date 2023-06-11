public class isSorted {
    public static void main(String[] args) {
        int[] arr = {4,5,6,7,8};
        boolean ans = sorted(arr);
        System.out.println(ans + " that the array is sorted.");
    }
    static boolean sorted(int[] arr){
        for(int i=1;i<arr.length;i++){
            if(arr[i] < arr[i-1]){
                return false;
            }
        }
        return true;
    }
}
