class Solution {
    public int removeDuplicates(int[] nums) {
        
        // 1 1 2 3 4
        int count = 1;

        int s = 1; 
        int f = 1;

        while(f<nums.length){ // 1<5,2<5,3<5,4<5

            if(nums[f] !=nums[s-1]){  //nums[1] !=nums[0] --> 1; 
                nums[s] = nums[f];
                s++;
                count++;
            }
            f++;
        }

       

        return count;
    }
}