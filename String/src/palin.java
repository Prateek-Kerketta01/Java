import java.util.Scanner;

public class palin {
    public static void main(String[] args) {
        Scanner  input =  new Scanner(System.in);
        System.out.print("Enter your string to check if palindrome:- ");
        String str = input.next();
        Boolean ans = ispal(str);
        System.out.println(ans);
    }
    static boolean ispal(String str){
        StringBuilder rev = new StringBuilder(str);
        rev.reverse();
        return str.equals(rev.toString());
    }
}
