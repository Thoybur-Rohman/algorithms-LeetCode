public class Solution {

    // nums = [1,2,3,1]

    public bool ContainsDuplicate(int[] nums) {
        HashSet<int> checkIsSame = new HashSet<int>();

        foreach (int i in nums ){
            checkIsSame.Add(i);
        }
        return checkIsSame.Count != nums.Length;

    }
}
