import java.util.Scanner;

public class CountSetBits {

    static int countSetBits(int num){
        int count= 0;

        while( num != 0){
            num = num & (num-1);
            count++;
        }

        return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try{
           
            int num = sc.nextInt();
            System.out.println(countSetBits(num));
        }
        finally{
            sc.close();
        }
        
    }
}
