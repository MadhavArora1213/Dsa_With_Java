// Best time to buy and sell stock

package LeetCode_Array_And_BinarySearch;

public class Problem121 {
    public int maxProfit(int[] prices) {
        int maxProfit =0, bestBuy = prices[0];
        for(int i=1;i<prices.length;i++){
            bestBuy = Math.min(bestBuy,prices[i]);
            if(prices[i] > bestBuy){
                maxProfit = Math.max(maxProfit, prices[i] - bestBuy);
            }
            
            }
            return maxProfit;
    }
    public static void main(String[] args) {
        
    }
}
