class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n=nums.length;
        int[] d=new int[n];
        int[] w=new int[n];
        int[] ans=new int[n];
        d[0]=1;
        w[n-1]=1;
        for(int i=1;i<n;i++){
            d[i]=d[i-1]*nums[i-1];
        }    
        for(int i=n-2;i>=0;i--){
            w[i]=w[i+1]*nums[i+1];
        }

        for(int i=0;i<n;i++){
            ans[i]=d[i]*w[i];
        }

        return ans;
    }
}  
