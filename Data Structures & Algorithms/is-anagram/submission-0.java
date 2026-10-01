class Solution {
    public boolean isAnagram(String s, String t) {

        if(s.length()!=t.length()){

            return false;
        }

        Map<Character,Integer> mp  = new HashMap<>();

        for( char x:s.toCharArray()){

            mp.put(x,mp.getOrDefault(x,0)+1);

        }

        for(char y:t.toCharArray()){

            if(!mp.containsKey(y)){

                return false;
            }

            mp.put(y,mp.getOrDefault(y,0)-1);

            if(mp.get(y)<0){

                return false;
            }
        }

        return true;
    }
}
