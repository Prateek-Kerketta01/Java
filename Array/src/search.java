import java.util.Scanner;

public class search {
    public static void main(String[] args) {
        int[] arr={1,3,5,6};
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number to search");
        int n = input.nextInt();
        for(int i : arr){
            if(i==n) {
                System.out.println("number is found");
                return;
            }
        }
        System.out.println("Not found");
    }
}
