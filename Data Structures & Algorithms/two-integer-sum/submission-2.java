class Solution {
    public int[] twoSum(int[] nums, int target) {
        

        Map<Integer,Integer> res = new HashMap<>();

        for(int i=0;i<nums.length;i++){
            res.put(nums[i],i);

        }

        for(int i=0;i<res.size();i++){

            int comp = target - nums[i];

            if(res.containsKey(comp) && res.get(comp)!=i){
                return new int[]{i,res.get(comp)};
            }
        }
        return new int[]{};
    }
}
