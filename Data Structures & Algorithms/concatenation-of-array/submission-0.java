class Solution {
    public int[] getConcatenation(int[] nums) {
        int n=nums.length;
        int m=n*2;
        int[] d=new int[m];
        for(int i=0;i<n;i++){
            d[i]=nums[i];
            d[n+i]=nums[i];
        }
        return d;
    }
}