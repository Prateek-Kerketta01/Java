public class Main {
    public static void main(String[] args) {
        String s1 = "prateek";
        String s2 = "prateek";
        String s3 = "prateekKerketta";
        System.out.println(s1.equals(s2));
        System.out.println(s3.contains(s2));
        System.out.println(s1.compareTo(s2));
        System.out.println(s3.compareTo(s1));
        System.out.println(s3.indexOf(s1));
    }
}