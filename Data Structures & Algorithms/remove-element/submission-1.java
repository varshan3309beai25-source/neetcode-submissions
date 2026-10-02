class Solution {
    public int removeElement(int[] nums, int val) {
        
        List<Integer> mp = new ArrayList<>();

        for(int x:nums){

            if(x!=val){

                mp.add(x);
            }
        }

        for(int i=0;i<mp.size();i++){

            nums[i] = mp.get(i);
        }

        return mp.size();
    }
}