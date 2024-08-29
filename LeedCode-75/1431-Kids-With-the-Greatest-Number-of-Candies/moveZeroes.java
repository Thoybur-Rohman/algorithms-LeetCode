class Solution {
    public void moveZeroes(int[] nums) {
        int n = nums.length;

        int lastNonZeroVarIndex = 0;

        for (int i = 0 ; i < n ; i ++){
            if (nums[i] !=0){
                int tempVar = nums[i];
                nums[i] = nums[lastNonZeroVarIndex];
                nums[lastNonZeroVarIndex] = tempVar;

                lastNonZeroVarIndex ++;
            }
        }
    }
}
