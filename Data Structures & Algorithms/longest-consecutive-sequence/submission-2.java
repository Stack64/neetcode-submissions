class Solution {
    public int longestConsecutive(int[] nums) {
        int n=nums.length;
        int ans=0;
        Set<Integer> gg=new HashSet<>();
        for(int i:nums){
            gg.add(i);
        }
        for(int m:nums){
            int sum=0;
            int curr=m;
            while(gg.contains(curr)){
                sum++;
                curr++;
            }
            ans=Math.max(ans,sum);
        }
        return ans;
    }
}
