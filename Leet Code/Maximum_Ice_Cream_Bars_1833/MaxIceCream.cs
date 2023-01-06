public class Solution {
    public int MaxIceCream(int[] costs, int coins) {
    // Step 1 
       int count = 0;
        // Step 2 
       Array.Sort(costs);
        // Step 3  
       foreach (var cost in costs)
       {
            // step 4 
           if (cost <= coins)
           {
             // Step 5
             coins = coins - cost;
             count++;
           }          
       }
       return count;
    }
}
