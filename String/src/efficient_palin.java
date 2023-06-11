import java.util.Scanner;

public class efficient_palin {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your string to check if palindrome:- ");
        String str = input.next();
        boolean ans = isPal(str);
        System.out.println(ans + " that the entered stirng is palindrome");
    }
    static boolean isPal(String str){
        int begin = 0;
        int end = str.length() -1;
        while(begin < end){
            if(str.charAt(begin) != str.charAt(end)){
                return false;
            }
            begin++;
            end--;
        }
        return true;
    }
}
