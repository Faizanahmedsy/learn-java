
import java.util.*;

public class FindLargest {

    public static int findLargest(int nums[]){
        int largest = Integer.MIN_VALUE;//-infinity

        for(int i =0; i<nums.length; i++){
            if(largest< nums[i]){
                largest = nums[i];
            }
        }
        return largest;
    }

    public static void main(String[] args) {

        int nums[] ={1,200,3,4};

        int result = findLargest(nums);

        System.out.println(result);




        
    }
}
