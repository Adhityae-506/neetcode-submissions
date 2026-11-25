class Solution {
    public int maxArea(int[] heights) {
        int i = 0, j = heights.length - 1;
        int maxCap = Integer.MIN_VALUE;

        while(i < heights.length && j < heights.length){
            int currCap = 0;
            currCap = (j - i) * Math.min(heights[i], heights[j]);
            maxCap = Math.max(maxCap, currCap);

            if(heights[i] > heights[j]){
                j--;
            }else{
                i++;
            }
        }
        return maxCap;
    }
}
