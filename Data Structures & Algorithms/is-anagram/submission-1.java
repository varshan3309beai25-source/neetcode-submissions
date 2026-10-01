class Solution {
    public boolean isAnagram(String s, String t) {


        if(s.length()!=t.length()){

            return false;
        }


        char[]  ts = t.toCharArray();

        char[] ss = s.toCharArray();

        Arrays.sort(ts);
        Arrays.sort(ss);

        return Arrays.equals(ts,ss);
    }
}
