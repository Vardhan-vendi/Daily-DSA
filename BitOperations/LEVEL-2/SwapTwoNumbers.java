import java.util.Scanner;

public class SwapTwoNumbers {
    static int[] swapTwoNumbers(int a , int b){
            a= a^b;
            b= a^b;
            a = a^b;
            return new int[]{a,b};
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        
        int[] res = swapTwoNumbers(a, b);
        for (int num : res){
            System.out.print(num + " ");
        }
    }
}
