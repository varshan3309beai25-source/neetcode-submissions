class Solution {
    public int majorityElement(int[] nums) {
        

        Map<Integer,Integer> mp = new HashMap<>();

        int res =0;
        int max = 0;

        for(int x:nums){

            mp.put(x,mp.getOrDefault(x,0)+1);

            if(mp.get(x)>max){

                res = x;
                max = mp.get(x);
            }


        }
        return res;
    }
}