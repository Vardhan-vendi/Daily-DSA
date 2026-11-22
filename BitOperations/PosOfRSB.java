
import java.util.Scanner;

public class PosOfRSB {
    static int posOfRSB(int num) {
        return (int)(Math.log10(num & -num) / Math.log10(2)) + 1;
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
