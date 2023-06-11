public class rec_subsequence {
    public static void main(String[] args) {
        String s1 = "ABCDEF", s2 = "ADF";
        int n = s1.length(), m = s2.length();
        boolean ans = isSub(s1,s2,n,m);
        System.out.println(ans + " that the s2 is subsequence of s1.");
    }
    static boolean isSub(String s1, String s2, int n, int m){
        if(m==0){
            return true;
        }
        if(n==0){
            return false;
        }
        if(s1.charAt(n-1) == s2.charAt(m-1)){
            return isSub(s1,s2,n-1,m-1);
        }else{
            return isSub(s1,s2,n-1,m);
        }
    }
}
