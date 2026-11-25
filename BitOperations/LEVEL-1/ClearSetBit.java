
import java.util.Scanner;

public class ClearSetBit {
    static int clearSetBit(int num, int pos){
        // if only to clear set bit--> n & (~(1<<k))
        return  num & (~(1<<pos));
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int pos = sc.nextInt();

        System.out.println(clearSetBit(num, pos));
        sc.close();

    }}
