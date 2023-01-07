public class Solution 
{
    public int[] FinalPrices(int[] prices) 
    {
        // Step 1 
        int[] fianlPrice = new int[prices.Length];
         bool discountApplied = false;
        // Step 2 
        for (int i = 0 ; i < prices.Length  ; i ++)
        {
            for (int j = i + 1 ; j < prices.Length ; j ++)
            {
                // Step 3 
                if (prices[i] >= prices[j]) 
                {
                fianlPrice[i] = prices[i] - prices[j];
                discountApplied = true;
                break;       
                }
        
            }
            // Step 4 
            if (!discountApplied){
                fianlPrice[i] = prices[i];
                
            }
            // Step 5 
            discountApplied = false ;
        }
        // Step 6
        return fianlPrice;
    }
}
