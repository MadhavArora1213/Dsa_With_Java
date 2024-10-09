// Container with most water
package LeetCode_Array_And_BinarySearch;

public class Problem11{
    public int maxArea(int[] height) {
        int MaxWater = 0;
        int lp= 0, rp= height.length -1;
        while(lp<rp){
            int w = rp-lp;
            int ht = Math.min(height[lp], height[rp]);
            int area = w*ht;
            MaxWater = Math.max(MaxWater,area);
            if(height[lp]<height[rp]){
                lp++;
            }else{
                rp--;
            }
                    
                    
        }
        return MaxWater;
    }
    public static void main(String[] args){
        
    }
}