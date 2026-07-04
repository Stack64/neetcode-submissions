class Solution {
    public int maxProfit(int[] prices) {
        int maxx=0;
        int minn=prices[0];
        for(int sell:prices){
            maxx=Math.max(maxx,sell-minn);
            minn=Math.min(minn,sell);
        }
        return maxx;
    }
}