import java.util.HashMap;
import java.util.Map;

public class TwoSum {

    public static void main(String[] args) {

        int [] numbs = {2,7,11,15};
        twoSum(numbs,9);
    }

    //Solution 1
    public static int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[j] == target - nums[i]) {
                    System.out.print("hi");
                    return new int[] { i, j };

                }
            }
        }
        // In case there is no solution, we'll just return null
        return null;
    }
    //Solution 2
    class Solution {
        public int[] twoSum(int[] nums, int target) {
            Map<Integer, Integer> map = new HashMap<>();
            for (int i = 0; i < nums.length; i++) {
                map.put(nums[i], i);
            }
            for (int i = 0; i < nums.length; i++) {
                int complement = target - nums[i];
                if (map.containsKey(complement) && map.get(complement) != i) {
                    return new int[] { i, map.get(complement) };
                }
            }
            // In case there is no solution, we'll just return null
            return null;
        }
    }
}
