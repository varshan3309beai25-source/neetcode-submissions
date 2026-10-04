class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        
        Map<String,List<String>> mp = new HashMap<>(); //mp={}

        for(String s:strs){ //act

            char[] arr = s.toCharArray();// ['a','c','t']
            Arrays.sort(arr);//['a','c','t']


            String key = new String(arr); //key="act"

            mp.putIfAbsent(key,new ArrayList<>()); //add if exist else make new empty list 
            mp.get(key).add(s); //key-->value

        }

        return new ArrayList<>(mp.values()); //mp.values is collection but have to return List-->ArrayList
    }
}
