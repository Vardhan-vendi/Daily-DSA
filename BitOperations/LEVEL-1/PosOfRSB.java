
import java.util.Scanner;

public class PosOfRSB {
    static int posOfRSB(int num) {
        // n & -n
         return (int)(Math.log10(num & -num) / Math.log10(2)) + 1;

        // n ^ (n & (n-1))
       // return (int)(Math.log10(num ^ (num & (num-1))) / Math.log10(2)) + 1 ;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            int num = sc.nextInt();
            System.out.println(posOfRSB(num));
            
        } finally {
            sc.close();
        }
    }
}
