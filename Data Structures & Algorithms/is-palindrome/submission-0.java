class Solution {
    public boolean isPalindrome(String s) {
        int f = 0;
        int e = s.length()-1;

        while(f<e){

            while(f<e && !Character.isLetterOrDigit(s.charAt(f))){
                f++;
            }

            while(f<e && !Character.isLetterOrDigit(s.charAt(e))){
                e--;
            } 

            if(Character.toLowerCase(s.charAt(f))!=Character.toLowerCase(s.charAt(e))){
                return false;
            }
            f++;
            e--;
        }
        return true;
    }
}
