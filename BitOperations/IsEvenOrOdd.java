
import java.util.Scanner;

public class IsEvenOrOdd{
    static String isEvenOrOdd(int n) {
        return (n & 1) == 0 ? "Even" : "odd";
        
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int num =  sc.nextInt();
        System.out.println(isEvenOrOdd(num));

        sc.close();

    }
}