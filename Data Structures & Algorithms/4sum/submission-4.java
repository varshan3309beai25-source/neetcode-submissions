class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        
        List<List<Integer>> mp = new ArrayList<>();
        Arrays.sort(nums);

        for(int i=0;i<nums.length-3;i++){
            if(i>0 && nums[i-1]==nums[i]){
                    continue;
                }
            for(int j=i+1;j<nums.length-2;j++){
                int l = j+1;
                int e = nums.length-1;
                
                if(j>i+1 && nums[j-1]==nums[j]){
                    continue;
                }
                while(l<e){
                    long sum = (long)nums[i]+nums[j]+nums[l]+nums[e];

                    if(sum==target){
                        mp.add(Arrays.asList(nums[i],nums[j],nums[l],nums[e]));
                        l++;
                        e--;

                        while(l<e && nums[l-1]==nums[l]){
                            l++;
                        }
                        while(l<e && nums[e+1]==nums[e]){
                            e--;
                        }
                    }

                    else if(sum>target){
                        e--;
                    }
                    else{
                        l++;
                    }
                }
            }
        }

        return mp;
    }
}