class Solution {
    public void sortColors(int[] nums) {

        //0--red
        //1--white
        //2--blue
        int[] c = new int[3];
        for(int x:nums){
            c[x]++;
        }


        int index = 0;

        for(int i=0;i<3;i++){

            while(c[i]>0){
                nums[index] = i;
                index++;
                c[i]--;

            }
        }

    }
}