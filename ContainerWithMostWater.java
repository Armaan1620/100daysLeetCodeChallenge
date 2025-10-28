class Solution {
    public int maxArea(int[] height) {
          int i = 0;
        int j = height.length-1;
        int finalArea = 0;
        while(i<j){
            int minH=Math.min(height[i], height[j]);
            finalArea = Math.max(finalArea, (j-i)*minH);
            while(height[i]<=minH && i<j)
                ++i;
            while(height[j]<=minH && i<j)
                --j;
        }
        return finalArea;
    }
}