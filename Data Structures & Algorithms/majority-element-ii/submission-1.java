class Solution {
    public List<Integer> majorityElement(int[] nums) {
        Set<Integer> ans = new HashSet<>();

        for(int x:nums){
            
            int count = 0;
            for(int i:nums){
                if(i==x){
                    count++;
                }
            }

            if(count>nums.length/3){
                ans.add(x);
            }
        }

        return new ArrayList<>(ans);
    }
}