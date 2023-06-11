public class Josephus_problem {
    public static void main(String[] args) {
        int ans = myjos(5,3);
        System.out.println(ans);
    }
    static int myjos(int n,int k){
        return jos(n,k) + 1;
    }
    static int jos(int n, int k){
        if(n==1){
            return 0;
        }
        else {
            return (jos(n-1,k)+k) % n;
        }
    }
}
