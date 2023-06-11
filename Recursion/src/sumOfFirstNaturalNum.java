public class sumOfFirstNaturalNum {
    public static void main(String[] args) {
        int ans = sum(3);
        System.out.println(ans);
    }
    static int sum(int n){
        if(n==0){
            return n;
        }
        return n+sum(n-1);
    }
}
