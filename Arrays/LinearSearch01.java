public class LinearSearch01 {


    //Time complexity os O(n)
    public static int linearSearch(int nums[], int key) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == key) {
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int nums[] = { 2, 4, 6, 8, 10, 12, 14, 16, 18 };
        int key = 16;
        int result = linearSearch(nums, key);


        if(result == -1){
            System.out.println("Key not found");
        } else{

            System.out.println("key is at " + result);
        }
    }
}
