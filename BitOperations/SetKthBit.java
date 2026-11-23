import java.util.Scanner;

public class SetKthBit {

    static int setKthBit(int num,int pos){


        return num | (1<< pos);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int pos = sc.nextInt();

        System.out.println(setKthBit(num, pos));
    }
}
