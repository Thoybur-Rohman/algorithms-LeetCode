# Intuition
prices[j] <= prices[i]. Otherwise, you will not receive any discount at all
Return an integer array answer where answer[i] is the final price you will pay for the ith item of the shop, considering the special discount.
# Approach
We first create an empty array (same size as the input array) and a boolean variable.
We use two for loops similar to the sliding window idea to search through our array. We set j = i + 1 because we do not want a case where j is smaller than i, which could mean that numbers before i are discounted.
If the price at prices[i] is greater than the price at prices[j], we remove it and put the final price in the finalPrice array. We also set discountApplied to true to avoid triggering the if statement after the break statement.
If the array cannot find a number smaller than what is at prices[i], we just add prices[i] to the finalPrice array.
We set discountApplied to false to reset everything.
After the entire string array has been searched through, we return the finalPrice array.
# Complexity
Time complexity: 136 ms to 180 ms ish
Space complexity: 43.8 MB
