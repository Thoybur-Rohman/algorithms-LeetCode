public class Solution {
    public int maxArea(int[] height) {
        int maxarea = 0;
        for (int leftPointer = 0; leftPointer < height.length; leftPointer++) {
            for (int right = leftPointer + 1; right < height.length; right++) {
                int width = right - leftPointer;
                maxarea = Math.max(maxarea, Math.min(height[leftPointer], height[right]) * width);
            }
        }
        return maxarea;
    } 
} 
