public class palindrome {
    public static void main(String[] args) {
        String str = "abcba";
        int start = str.length();
        int end = str.length() -1;
        boolean ans = ispalin(str, start,end);
        System.out.println(ans);
    }
    static boolean ispalin(String str, int start, int end){
        if(start >= end){
            return  true;
        }
        return (str.charAt(start) == str.charAt(end))&&ispalin(str,start+1,end-1);
    }
}
