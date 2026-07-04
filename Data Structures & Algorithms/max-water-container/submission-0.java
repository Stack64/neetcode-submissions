class Solution {
    public int maxArea(int[] heights) {
        int l=0;
        int r=heights.length-1;
        int maxx=0;
        while(l<r){
            int j=Math.min(heights[l],heights[r]);
            int k=r-l;
            int A= j*k;
            maxx=Math.max(maxx,A);
            if(heights[l]<heights[r]){
                l++;
            }else{
                r--;
            }
        }
        return maxx;
    }
}
