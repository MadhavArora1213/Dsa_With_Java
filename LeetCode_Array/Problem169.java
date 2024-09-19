package LeetCode_Array;

public class Problem169 {
    public static int majorityElement(int[] nums) {
        int freq =0;
        int ans =0;
        int n = nums.length;
        for(int i =0; i<n; i++){
          if(freq == 0){
              ans = nums[i];
          }
          if(ans == nums[i]) freq++;
          else freq--;
        }
        return ans;
      }
    public static void main(String[] args) {
        System.out.println(majorityElement(new int[] {2,3,4,5}));
    }
}
