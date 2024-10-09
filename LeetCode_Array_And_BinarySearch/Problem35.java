// Search Insert Position
package LeetCode_Array_And_BinarySearch;

public class Problem35 {
    public static int searchInsert(int[] arr, int target) {
        int st = 0;
        int end = arr.length - 1;
        int ans = arr.length; // Initialize ans to the end of the array

        while (st <= end) {
            int mid = st + (end - st) / 2;
            if (target == arr[mid]) {
                return mid;
            }
            if (target < arr[mid]) {
                end = mid - 1;
                ans = mid; // Update ans to the current mid
            } else {
                st = mid + 1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
       System.out.println(searchInsert(new int[] {2,5,6,7}, 5));
    }
}
