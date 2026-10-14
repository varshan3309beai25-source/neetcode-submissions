class Solution {
    public void reverseString(char[] s) {
        
        int s1 = 0;
        int e = s.length-1;

        while(s1<e){

            char t = s[s1];
            s[s1] = s[e];
            s[e] = t;
            s1++;
            e--;
        }
    }
}