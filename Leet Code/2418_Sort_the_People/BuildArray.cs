public class Solution {
    public int[] BuildArray(int[] nums) {
    int[] Array = new int[nums.Length];
    for(int i = 0; i < nums.Length; i++)
        Array[i] = nums[nums[i]];     
    return Array;
    }
}
