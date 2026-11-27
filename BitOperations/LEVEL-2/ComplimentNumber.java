import java.util.Scanner;
public class ComplimentNumber {


    static int complimentNumber(int num){
        // finding the mask 
        // firstly we have to find the valid bit count
        if(num == 0){
            return 1;
        }
         byte count = 0;
         int temp = num;
         while (temp > 0){
            temp = temp >> 1;
            count ++;
            
         }

         int mask = (1 << count)-1;
         return  num  ^ mask;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println(complimentNumber(num));
        sc.close();
    }
}
