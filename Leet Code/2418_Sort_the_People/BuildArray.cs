public class Solution 
{
    public string[] SortPeople(string[] names, int[] heights) 
    {
        Dictionary<int, string> nameAndHeights = new();
        for (int i=0; i<heights.Length; i++)
        {
            nameAndHeights.Add(heights[i], names[i]);
        }
        return nameAndHeights.OrderByDescending(key=>key.Key).Select(value=>value.Value).ToArray();
    }
}
