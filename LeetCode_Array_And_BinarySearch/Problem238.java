// Product of Array Except Self

package LeetCode_Array_And_BinarySearch;

public class Problem238 {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int mul = 1;
        int zero = 0;
        int idx = 0;
        for (int i=0; i<n; i++) {
            if (nums[i]==0) {
                zero++;
                idx = i;
                continue;
            }
            mul *= nums[i];
        }
        int []ans = new int[n];
        if (zero>1) {
            return ans;
        }
        else if(zero==1) {
            ans[idx] = mul;
            return ans;
        }
        else {
            for (int i=0; i<n; i++) {
                ans[i] = mul/nums[i];
            }
            return ans;
        }

    }
    public static void main(String[] args) {
        
    }
}