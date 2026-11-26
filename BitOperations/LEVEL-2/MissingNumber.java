
import java.util.Scanner;

public class MissingNumber {

    static int missingNumber(int[] nums,int n){
        int res = 0; 
        for(int i = 1;i<=n;i++){
            res ^= i;
        }
        for(int num : nums){
            res ^= num;
        }
        return res;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n-1];
        for(int i=0;i<n-1;i++){
            nums[i]= sc.nextInt();
        }
        System.out.println(missingNumber(nums, n));
         sc.close();
    }
}
