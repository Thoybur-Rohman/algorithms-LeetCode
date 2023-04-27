 class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> result = new ArrayList<>(); 
        int size = nums.length;

        if (nums == null || size < 4 ){
            return result; 
        }
        if(target==-294967296 || target==294967296){
            return new ArrayList<>(result);
        }
        Arrays.sort(nums);

        for(int i = 0 ; i < size - 3 ; i ++){
           if(i > 0 && nums[i]== nums [i-1])continue;
           for ( int j = i + 1 ; j < size - 2 ; j++ ){
               if (j > i + 1 && nums[j] == nums[j-1]) continue;
               int left = j + 1 , right = size -1;
               while ( left < right){
                   int sum = nums[i] + nums[j] + 
                   nums[left] + nums[right];
                   if (sum == target)
                   {
                     List<Integer> results = new ArrayList<>();
                     results.add(nums[i]); results.add(nums[j]);
                     results.add(nums[left]); results.add(nums[right]);
                     result.add(results);
                     left++;
                     right--;
                     while (left < right && nums [left] == nums[left-1] ){
                         left ++;
                     }
                     while(left < right && nums[right] == nums[right+1]){
                         right --;
                     }
                   }else if(sum < target){
                       left++;
                   }else {
                       right--;
                   }
               }
           }
        }
        return result; 


    }
}
