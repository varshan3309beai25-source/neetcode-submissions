class Solution {
    public int longestConsecutive(int[] nums) {
        

        Arrays.sort(nums);

        // 2 3 4  4 5 10 20

        int c = 1;
        int l = 1;

        if(nums.length == 0){
            return 0;
        }
        
        for(int i=0;i<nums.length-1;i++){

            if(nums[i] == nums[i+1]){
                continue;
            }

            if(nums[i+1] == nums[i]+1){
                c++;
                

                l = Math.max(c,l);
                
            }
            else{
                c=1;
            }
        }

        return l;
    }
}
