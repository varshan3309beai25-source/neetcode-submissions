class Solution {
    public int maxArea(int[] heights) {
        
        int left = 0;
        int right = heights.length-1;
        int max_area = 0;

        while(left<right){
            int width = right-left;
            int area = Math.min(heights[left],heights[right])*width;

            max_area = Math.max(area,max_area);

            if(heights[left]<heights[right]){
                left++;
            }
            else{
                right--;
            }
        }
        return max_area;
    }
}
