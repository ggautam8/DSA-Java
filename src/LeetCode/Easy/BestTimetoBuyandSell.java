

public class BestTimetoBuyandSell {
    public static void main(String[] args){
        int [] prices = { 7, 1, 5, 3, 5, 4};

        Solution121 sol = new Solution121();
        int maxPr = sol.maxProfit(prices);

        System.out.print("Max profit: " + maxPr);
    }
}

class Solution121{
    public int maxProfit(int[] prices){
        int minPrice = Integer.MAX_VALUE;
        int maxPr = 0;

        for(int i = 0; i < prices.length; i++){
            if(prices[i] < minPrice){
                minPrice = prices[i];
            }
            else{
                maxPr = Math.max(maxPr, prices[i] - minPrice);
            }
        }
        return maxPr;
    }
}
