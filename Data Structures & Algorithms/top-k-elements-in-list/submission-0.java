class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer> mm=new HashMap<>();
        for(int i:nums){
            mm.put(i,mm.getOrDefault(i,0)+1);
        }
        PriorityQueue<Integer> pq=new PriorityQueue<>((a,b)-> mm.get(a)-mm.get(b));
        for(int i : mm.keySet()){
            pq.offer(i);
            if(pq.size()>k){
                pq.poll();
            }
        }

        int[] ans=new int[k];

        for(int i=k-1;i>=0;i--){
            ans[i]=pq.poll();
        }

        return ans;
    }
}
