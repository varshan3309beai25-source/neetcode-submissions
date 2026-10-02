class Solution {
    public int removeElement(int[] nums, int val) {
        
        int s = 0;
        int e = nums.length;

        while(e>s){

            if(nums[s]==val){

                nums[s] = nums[--e];
                
            }
            else{
                s++;
            }
        }
        return e;
    }
}