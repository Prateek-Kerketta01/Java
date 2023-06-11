public class tailedrec_fact {
    public static void main(String[] args) {
        int ans = fact(5,1);
        System.out.println(ans);
    }
    static int fact(int n, int k){
        if(n==0 || n==1){
            return k;
        }
        return fact(n-1,k*n);
    }
}
