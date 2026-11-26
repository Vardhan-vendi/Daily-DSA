//XOR partitioning

//  1. find the XOR of all elements
//  2. find the rsb of result of XOR.
//  3. find  group on nums & rsb as == 0 and !=0 
//  4. we get the results

import java.util.Scanner;

public class TwoNonRepeatingNumbers {
    static int[] twoNonRepeatingNumbers(int[] nums){
        int num1 = 0;
        int num2 = 0;
        int XOR = 0 ;
        for (int num : nums){
            XOR ^= num ;
        }

        int mask = XOR ^ (XOR &(XOR-1)); //XOR & -XOR
         for(int num : nums){
            if((num & mask) == 0 ){
                num1 ^= num;
            }
            else{
                num2 ^=num;
            }
         }


        return new int[]{num1,num2};
    }
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for(int i=0;i<n;i++){
            nums[i]= sc.nextInt();
        }
        int[] res = twoNonRepeatingNumbers(nums);
        for (int num : res){
            System.out.println(num);
        }
        sc.close();
    }
}
