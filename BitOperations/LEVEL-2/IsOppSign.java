
import java.util.Scanner;
// checking two are having the same or different signs
// to solve this we have to work on the most significant bit
public class IsOppSign {
    static boolean isOppSign( int num1 ,int num2){
        return (num1 ^ num2) < 0;
        // return (num1>>>31) != (num2>>>31);
    }
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        int num1 =sc.nextInt();
        int num2 =sc.nextInt();
        System.out.println(isOppSign(num1, num2));
    }
}

