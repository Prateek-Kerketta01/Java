import java.util.Arrays;

public class anagram {
    public static void main(String[] args) {
        String s1 = "silent";
        String s2 = "listen";
        boolean ans = isana(s1,s2);
        System.out.println(ans + " that both the string the anagram of each other.");
    }
    static boolean isana(String s1, String s2){
        char a1[] = s1.toCharArray();
        Arrays.sort(a1);
        s1 = new String(a1);

        char a2[] = s2.toCharArray();
        Arrays.sort(a2);
        s2 = new String(a2);

        return s1.equals(s2);
    }
}
