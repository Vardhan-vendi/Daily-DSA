import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public  class UniqueElement{
    static int uniqueElement(List<Integer> nums ){
        int res = 0;
        for (int num : nums){
            res = res ^ num;
        }
        return res;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> nums = new ArrayList<>();

       while(sc.hasNextInt()){
        nums.add(sc.nextInt());
       }
    //    for (int num : nums){
    //     System.out.println(num);
    //    }
       System.out.println(uniqueElement(nums));



    }
}