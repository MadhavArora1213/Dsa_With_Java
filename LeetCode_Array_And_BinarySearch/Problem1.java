// Two Sum
package LeetCode_Array_And_BinarySearch;

public class Problem1 {

    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " "); //priting array element after each iteration
        }
        System.out.println();
    }

    public static int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        for (int i = 0; i < nums.length-1; i++) {
            
                if (nums[i] + nums[i+1] == target && nums[i+1]<nums.length) {
                    result[0] = i;
                    result[1] = i+1;
                    return result;
                }
           
        }
        return result; 
    }

    public static void main(String[] args) {
        int[] nums = {2,7,11,15};
        printArray(nums);
        int[] result = twoSum(nums, 9);
        printArray(result);
    }
}
