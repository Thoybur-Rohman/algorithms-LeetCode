# Intuition

- length n = number of ice cream bars.
- costs[i] = price of each ice cream bar.
- coins = money of how much it available.

The boy initially has coins to spend, and he wants to buy as many ice cream bars as possible.

Constraints:

- costs.length == n
- 1 <= n <= 105
- 1 <= costs[i] <= 105
- 1 <= coins <= 108

# Approach
We first create a int count to store the count of how many ice creams we can buy.

using Array.Sort() we sort the array to insure its all in order to make it eaiser to get the right amount and get the most.

using a foreach loop we itterate through array using the var cost to represent each eliment.

using a if statment we check if the cost is smaller than the ammount of coins left.

if SO then we remove from the coins - the cost and we add to the count of how many we an buy else we carry on through the array.

Complexity
