class Solution {
    public int singleNonDuplicate(int[] nums) {
        int n = nums.length;
        
        if(n==1) return nums[0];
        
        int l = 0;
        int r = n-1;
        int mid = 0;
        
        while(l<=r){
            mid = l + (r-l)/2;
            
            if(mid==0){
                if(nums[mid]!=nums[mid+1]) return nums[mid];
            }
            else if(mid==n-1){
                if(nums[mid]!=nums[mid-1]) return nums[mid];
            }
            
            if(nums[mid]!=nums[mid-1]  &&  nums[mid]!=nums[mid+1]) return nums[mid];
            
            if(nums[mid]==nums[mid+1]){
                if(mid%2==0) l = mid+1;
                else r = mid-1;
            }
            else if(nums[mid]==nums[mid-1]){
                if(mid%2==1) l = mid+1;
                else r = mid-1;
            }
        }
        
        return nums[mid];
    }
}