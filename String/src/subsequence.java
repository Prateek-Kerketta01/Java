public class subsequence {
    public static void main(String[] args) {
        String s1 = "ABCDEF";
        String s2 = "ADE";
        boolean ans = issub(s1,s2);
        System.out.println(ans + " that the s2 is a subsequence of s1.");
    }
    static boolean issub(String s1, String s2){
        int n = s1.length();
        int m = s2.length();
        int j=0;
        for(int i=0; i<n && j<m;j++){
            if(s1.charAt(i) == s2.charAt(j)){
                j++;
            }
        }
        return (j==m);
    }
}
