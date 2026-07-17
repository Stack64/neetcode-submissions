class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int n=nums.length;
        int[] arr=new int[n-k+1];
        for(int i=0;i<=n-k;i++){
            int mx=nums[i];
            for(int j=i;j<i+k;j++){
                mx=Math.max(nums[j],mx);
            }
            arr[i]=mx;
        }
        return arr;
    }
}
