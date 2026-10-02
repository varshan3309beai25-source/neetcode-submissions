class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        
        Map<Integer,Integer> mp = new HashMap<>();

        for(int x:nums){

            mp.put(x,mp.getOrDefault(x,0)+1);

            
        }

        PriorityQueue<Integer> pq = new PriorityQueue<>((a,b)->mp.get(a)-mp.get(b));

        for(int x:mp.keySet()){

            pq.add(x);

            if(pq.size()>k){
                pq.poll();
            }
        }

        int[] res = new int[k];

        for(int i=0;i<k;i++){

            res[i] = pq.poll();
        }

        return res;


    }
}
