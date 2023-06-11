public class generate_subsets {
    public static void main(String[] args) {
        String str = "ABC";
        String curr = "";
        int i = 0;
        generate(str, curr, i);
    }
    static void generate(String s, String  curr, int i){
        if(i ==  s.length()){
            System.out.println(curr);
            return;
        }
        generate(s,curr,i+1);
        generate(s,curr + s.charAt(i),i+1);
    }
}
