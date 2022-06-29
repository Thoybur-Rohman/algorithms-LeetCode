class Solution {
    public int subtractProductAndSum(int n) {
        
        String s = String.valueOf(n);
        int[] nums = new int[s.length()];
       int  Multiply = 1;
       int addition = 0;;
        int sum;
        for(int i = 0; i < s.length(); i++){
            nums[i] = s.charAt(i) - '0';
        }

        for(int i = 0; i < nums.length; i++){
            addition += nums[i];
            Multiply = Multiply * nums[i];
        }

        sum = Multiply - addition;

        return sum;
        
    }
}
