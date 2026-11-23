import java.util.Scanner;
public class IsSetBit {
    static boolean isSettBit(int num,int pos){

        return (num & (1<<pos) )!=0;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int pos = sc.nextInt();
        System.out.println(isSettBit(num, pos));
        sc.close();
    }
}
