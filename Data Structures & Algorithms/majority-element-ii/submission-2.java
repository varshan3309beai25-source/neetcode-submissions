class Solution {
    public List<Integer> majorityElement(int[] nums) {
        
        Map<Integer,Integer> mp = new HashMap<>();

        for(int x:nums){

            mp.put(x,mp.getOrDefault(x,0)+1);
        }

        List<Integer> ans = new ArrayList<>();

        for(int key:mp.keySet()){

            if(mp.get(key)>nums.length/3){
                ans.add(key);
            }

        }

        return ans;
    }
}