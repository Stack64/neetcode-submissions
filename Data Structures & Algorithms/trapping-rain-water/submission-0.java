class Solution {
    public int trap(int[] height) {
        //Brute Force

        int n=height.length;
        int ans=0;
        if(height==null && n==0) return 0;

        for(int i=0;i<n;i++){
            int lm=height[i];
            int rm=height[i];

            for(int j=0;j<i;j++){
                lm=Math.max(lm,height[j]);
            }
            for(int j=i+1;j<n;j++){
                rm=Math.max(rm,height[j]);
            }

            ans+=(Math.min(lm,rm)-height[i]);
        }

        return ans;
    }
}
