class Solution {
    public int removeElement(int[] nums, int val) {
        
        int s = 0;
        int e = 0;

        while(e<nums.length){

            if(nums[e]!=val){

                nums[s] = nums[e];
                s++;
            }
            e++;
        }
        return s;
    }
}