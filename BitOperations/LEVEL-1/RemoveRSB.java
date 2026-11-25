import java.util.Scanner;

public class RemoveRSB {
    static int removeRSB(int num){
        return num & (num-1);
        
        // if(num >0){
        //    num =  num & (num-1);
        //    return true;
        // }
        // return false;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        System.out.print(removeRSB(num));

    }
}
