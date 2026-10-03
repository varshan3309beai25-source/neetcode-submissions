class Solution {
    public int majorityElement(int[] nums) {
        Map<Integer,Integer> mp =new HashMap<>();

        int res = 0,maxc = 0;
        for(int i=0;i<nums.length;i++){

            mp.put(nums[i],mp.getOrDefault(nums[i],0)+1);

            if(mp.get(nums[i])>maxc){

                res = nums[i];
                maxc = mp.get(nums[i]);
            }



        }

        return res;

        
    }
}