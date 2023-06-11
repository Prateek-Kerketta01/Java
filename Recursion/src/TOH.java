public class TOH {
    public static void main(String[] args) {
        int n = 3;
        char A = 'a',B='b',C='c';
        arr(n,A,B,C);
    }
    static void arr(int n, char A, char B, char C){
        if(n==1){
            System.out.println("Move 1 from " + A + " to " + C);
            return;
        }
        arr(n-1,A,C,B);
        System.out.println("Move "+ n + " from "+A+" to " + C );
        arr(n-1,B,A,C);
    }
}
