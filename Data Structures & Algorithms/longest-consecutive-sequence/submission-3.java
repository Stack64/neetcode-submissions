class Solution {
    public int longestConsecutive(int[] nums) {
        Map<Integer,Integer> mpp=new HashMap<>();
        int ans=0;
        for(int n:nums){
            if(!mpp.containsKey(n)){
                mpp.put(n,mpp.getOrDefault(n-1,0)+mpp.getOrDefault(n+1,0)+1);
                mpp.put(n-mpp.getOrDefault(n-1,0),mpp.get(n));
                mpp.put(n+mpp.getOrDefault(n+1,0),mpp.get(n));
                ans=Math.max(ans,mpp.get(n));
                /*
                2,20,4,10,3,4,5
                1--1
                2--3
                3--3
                4--4
                5--4
                6--4
                9--1
                10--1
                11--1
                19-1
                20-1
                21-1
                */
            }
        }
        return ans;
    }
}
