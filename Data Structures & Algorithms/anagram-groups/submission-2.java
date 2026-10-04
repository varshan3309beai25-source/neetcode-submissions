class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> mp = new HashMap<>();

        for(String x:strs){

            char[] ch = x.toCharArray();

            Arrays.sort(ch);

            String k = new String(ch);

            mp.putIfAbsent(k,new ArrayList<>());
            mp.get(k).add(x);
        }

        return new ArrayList<>(mp.values());
    }
}
