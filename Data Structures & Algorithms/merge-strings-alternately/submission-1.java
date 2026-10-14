class Solution {
    public String mergeAlternately(String word1, String word2) {
        

        char[] c1 = word1.toCharArray();
        char[] c2 = word2.toCharArray();
       

        int i=0;
        int j=0;
        int k=0;


        char[] res = new char[word1.length()+word2.length()];

        while(i<c1.length && j<c2.length){

            res[k] = c1[i];
            k++;
            i++;
            res[k] = c2[j];
            k++;
            j++;
        }

        while(i<c1.length){
            res[k] = c1[i];
            i++;
            k++;
        }
        
        while(j<c2.length){
            res[k] = c2[j];
            j++;
            k++;
        }

        return new String(res);
    }
}