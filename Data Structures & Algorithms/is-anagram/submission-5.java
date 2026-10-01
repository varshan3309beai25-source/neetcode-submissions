class Solution {
    public boolean isAnagram(String s, String t) {

        if(s.length()!=t.length()){

            return false;
        }

        // int[] count = new int[26];
        // for(int i=0;i<s.length();i++){

        // count[s.charAt(i)-'a']++;
        // count[t.charAt(i)-'a']--;


        // }

        // for(int x:count){

        //     if(x<0){

        //         return false;
        //     }
        // }

        // return true;

        // char[] x = s.toCharArray();
        // char[] y = t.toCharArray();

        // Arrays.sort(x);
        // Arrays.sort(y);

        // return Arrays.equals(x,y);

        // Map<Character,Integer> counts = new HashMap<>();
        // Map<Character,Integer> countt = new HashMap<>();

        // for(int i=0;i<s.length();i++){
        // counts.put(s.charAt(i),counts.getOrDefault(s.charAt(i),0)+1);
        // countt.put(t.charAt(i),countt.getOrDefault(t.charAt(i),0)+1);

        // }

        // return counts.equals(countt);

        Map<Character,Integer> mp = new HashMap<>();

        for(char ch:s.toCharArray()){

            mp.put(ch,mp.getOrDefault(ch,0)+1);

        }

        for(char ch:t.toCharArray()){

            if(!mp.containsKey(ch)){
                return false;
            }

            mp.put(ch,mp.getOrDefault(ch,0)-1);

            if(mp.get(ch)<0){

                return false;
            }
        }
        return true;
    }
}
