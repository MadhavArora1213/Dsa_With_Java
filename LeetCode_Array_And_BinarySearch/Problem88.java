// Merge Sorted Array

package LeetCode_Array_And_BinarySearch;

public class Problem88 {
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        // Index of the last element in the merged array
        int i = m + n - 1;
        // Index of the last element in nums1's initialized part
        int p1 = m - 1;
        // Index of the last element in nums2
        int p2 = n - 1;

        // Merge the arrays from the end
        while (p1 >= 0 && p2 >= 0) {
            if (nums1[p1] > nums2[p2]) {
                nums1[i--] = nums1[p1--];
            } else {
                nums1[i--] = nums2[p2--];
            }
        }

        // Copy remaining elements from nums2 (if any)
        while (p2 >= 0) {
            nums1[i--] = nums2[p2--];
        }
    
    }
    public static void main(String[] args) {
  
    }
}
