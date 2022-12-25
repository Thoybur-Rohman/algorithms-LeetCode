public class Solution {
    public int MaxProfit(int[] prices) {
        int res = 0;
        if(prices == null || prices.Length <= 1) return res;

       int min = prices[0];
        for(int i=1; i<prices.Length; i++){
             if(prices[i] > min){
                res = Math.Max(res, prices[i] - min);
            }else{
                min = prices[i];
            }
        }

        return res;
    }
}
