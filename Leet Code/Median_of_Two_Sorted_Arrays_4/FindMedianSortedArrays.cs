public class Solution {
    public double FindMedianSortedArrays(int[] nums1, int[] nums2) {
         var myList = new List<int>();
         myList.AddRange(nums1);
         myList.AddRange(nums2);
         int[] mergedArray = myList.ToArray();
         double Output;

        // Sort the merged array
        Array.Sort(mergedArray);

        int n = mergedArray.Length;
         // If length of array is even
        if (n % 2 == 0)
        {
            int z = n / 2;
            int e = mergedArray[z];
            int q = mergedArray[z - 1];
 
            Output = (e + q )/ 2.0;
            return Output;
        }
        else
        {           
            int z = n / 2;
            return mergedArray[z];
        }        

    }
}
