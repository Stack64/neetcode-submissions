class Solution {
    public int maxProfit(int[] prices) {
        int min=Integer.MAX_VALUE;
        int mx=0;
        int pro=0;
        for(int pr:prices){
            min=Math.min(pr,min);
            pro=pr-min;
            mx=Math.max(mx,pro);
        }
        return mx;
    }
}
