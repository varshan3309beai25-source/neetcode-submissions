class Solution {
    public int subarraySum(int[] nums, int k) {
        
        Map<Integer,Integer> map = new HashMap<>();

        map.put(0,1);

        int prefix_s = 0;
        int c = 0;

        for(int x:nums){
            prefix_s+=x;

            c+=map.getOrDefault(prefix_s - k, 0);

            map.put(prefix_s , map.getOrDefault(prefix_s,0)+1);
        }

        return c;


    }
}