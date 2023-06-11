public class prac_2 {
    public static void main(String[] args) {
        int n = fun(16);
        System.out.println(n);
    }
    static int fun(int n){
        if(n==1){
            return 0;
        }
        else{
            return 1 + fun(n/2);
        }
    }
}
