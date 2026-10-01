class Solution {
    public int[] getConcatenation(int[] nums) {

        int n = nums.length;
        int[] res = new int[2*n];
        int k=0;

        for(int i=0;i<nums.length;i++){ // i=0 to i=3

            res[k] = nums[i];
            k++;
        }
        for(int i=0;i<nums.length;i++){
            res[k] = nums[i];
            k++;
        }

        return res;
    }
} 