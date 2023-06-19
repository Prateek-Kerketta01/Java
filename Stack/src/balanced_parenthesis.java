import java.util.ArrayDeque;
import java.util.Deque;

public class balanced_parenthesis {
    public static void main(String[] args) {
        String str = "[()]";
        System.out.println(isBalanced(str));
    }
    static boolean isBalanced(String str){
        Deque<Character> s = new ArrayDeque<>();
        for(int i=0;i<str.length();i++){
            char a = str.charAt(i);
            if(a == '(' || a == '[' || a == '{'){
                s.push(a);
            }else {
                if(s.isEmpty() == true){
                    return false;
                } else if (match(s.peek(),a) == false) {
                    return false;
                }
                else{
                    s.pop();
                }
            }
        }
        return (s.isEmpty() == true);
    }
    static  boolean match(char a, char b){
        return ((a=='(' && b==')' || a=='[' && b==']' || a=='{' && b=='}'));
    }
}
