public class BinarySearch01 {

    //binary search is use in sorted arrays
    //Time complexity : O(log n)

    public static int binarySearch(int nums[],int key){
        int start = 0,end = nums.length - 1;

        while(start <= end){
            int mid = (start + end)/2;

            if(nums[mid] == key){//if key is in middle
                return mid;
            }
            if(nums[mid] < key) {//search on right side
                start = mid+1;//start searching from right side of mid
            } else {
                end = mid-1; //start from 0 and end before mid
            }

        }

        return -1;
    }

    public static void main(String[] args) {
        int nums[] = {1,2,3,4,5,6,7,8,9,10};

        int result = binarySearch(nums, 7);

        System.out.println(result);

        
        

    }
}
