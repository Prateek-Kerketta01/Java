public class allPermutations {
    public static void main(String[] args) {
        String str = "ABC";
        int n = str.length();
        permut(str,0);
    }
    static void permut(String str, int n){
        if(n == str.length()-1){
            System.out.println(str);
        }
        else{
            for(int j=n;j<= str.length()-1;j++){
                str = swap(str,n,j);
                permut(str,n+1);
                str = swap(str,n,j);
            }
        }
    }
    static String swap(String a, int i, int j){
        char temp;
        char[] charArray = a.toCharArray();
        temp = charArray[i];
        charArray[i] = charArray[j];
        charArray[j] = temp;
        return String.valueOf(charArray);
    }
}
