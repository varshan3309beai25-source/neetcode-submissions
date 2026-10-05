class Solution {
    public int majorityElement(int[] nums) {
        
        int cand = nums[0];
        int c = 0;
        for(int num:nums){
            if(c==0){
                cand = num;
            }
            c+=(num==cand)?1:-1;
        }
        return cand;
    }
}