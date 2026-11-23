import java.util.Scanner;

public class ToggleKthBit {

    static int toggleKthBit(int num , int pos){
        return (num ^ (1<<pos));
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int pos = sc.nextInt();
        System.out.println(toggleKthBit(num, pos));
        
    }
}
