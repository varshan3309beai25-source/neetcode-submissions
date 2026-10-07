class Solution {
    public String mergeAlternately(String word1, String word2) {
        
        char[] c1 = word1.toCharArray();
        char[] c2 = word2.toCharArray();

        char[] res = new char[word1.length()+word2.length()];

        int i=0;
        int j=0;
        int k=0;

        while(i<c1.length && j<c2.length){

            res[k++] = c1[i++];
            res[k++] = c2[j++];
        }

        while(i<c1.length){
            res[k++] = c1[i++];
        }

        while(j<c2.length){
            res[k++] = c2[j++];
        }

        return new String(res);
    }
}