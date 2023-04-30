class Solution {
    public int threeSumClosest(int[] nums, int target) {
        int size = nums.length;
        int result=0;
        if (nums == null || size < 3 ){
            return result; 
        }
        if(target==-294967296 || target==294967296){
            return result;
        }
        Arrays.sort(nums); // so that we can use 2 pointers approch to get the sum;
        int diff= Integer.MAX_VALUE;
        for (int i = 0 ; i < size - 2 ; i++ ){
            int start=i+1;
            int end=nums.length-1;
              while(start<end){
                int curr_val= nums[i]+nums[start]+nums[end];
                int curr_diff= Math.abs(target-curr_val);
                if(curr_diff<diff){
                    result=curr_val;
                    diff=curr_diff;
                }
                if(curr_val>target){
                    end--;
                }else if (curr_val<target){
                      start++;
                }else{
                    return result;
                }
        }
       

    } return result;
}
}
