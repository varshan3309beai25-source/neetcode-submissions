class Solution {
    public int majorityElement(int[] nums) {
        
        Map<Integer,Integer> mp =new HashMap<>();

        for(int x:nums){

            mp.put(x,mp.getOrDefault(x,0)+1);

        }

        List<Integer> ans = new ArrayList<>();

        for(int y:mp.keySet()){

            if(mp.get(y)>nums.length/2){
                return y;
            }
        }

        return -1;
    }
}