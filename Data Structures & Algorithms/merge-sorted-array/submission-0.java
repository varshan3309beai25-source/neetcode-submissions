class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        
       int s1 = m-1;
       int s2 = n-1;
       int k = m+n-1;

       while(s1>=0 && s2>=0){

        if(nums1[s1]<nums2[s2]){

            nums1[k] = nums2[s2];
            s2--;
        }

        else{

            nums1[k] = nums1[s1];
            s1--;
        }

        k--;
       }

       while(s1>=0){
        nums1[k] = nums1[s1];
        s1--;
        k--;
       }

        while(s2>=0){
            nums1[k] = nums2[s2];
            s2--;
            k--;
        }
       

    }
}