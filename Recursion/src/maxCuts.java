public class maxCuts {
    public static void main(String[] args) {
        int n=23,a=12,b=9,c=11;
        int ans = cuts(n,a,b,c);
        System.out.println(ans);
    }
    static int cuts(int n, int a, int b, int c){
        if(n==0)
            return 0;
        if(n<=-1)
            return -1;
        int res = Math.max(cuts(n-a,a,b,c),
                Math.max(cuts(n-b,a,b,c), cuts(n-c,a,b,c)));
        if(res == -1){
            return -1;
        }
        return res+1;
    }
}
