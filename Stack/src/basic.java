import java.util.*;
public class basic {
    public static void main(String[] args) {
//        Stack<Integer> s = new Stack<>();
        ArrayDeque<Integer> s = new ArrayDeque<>();
        s.push(20);
        s.push(10);
        System.out.println(s.pop());
        System.out.println(s.peek());
        System.out.println(s.size());
        System.out.println(s.isEmpty());
    }
}
