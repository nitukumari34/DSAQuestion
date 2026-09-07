package org.example.Stack;

public class LarRecArea {
    public static int LargestRectangleArea(int[] nums) {

        int maxArea = 0;

        for (int i = 0; i < nums.length; i++) {

            int minHeight = nums[i];

            for (int j = i; j < nums.length; j++) {

                minHeight = Math.min(minHeight, nums[j]);

                int width = j - i + 1;

                int area = minHeight * width;

                maxArea = Math.max(maxArea, area);
            }
        }

        return maxArea;
    }
        public static void main(String[] args) {
        int[]nums = {2,1,5,6,2,3};
        int ans=LargestRectangleArea(nums);
            System.out.println(ans);
    }
}
