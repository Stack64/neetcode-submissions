class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int n=nums.length;
        PriorityQueue<int[]> ll =new PriorityQueue<>((a,b)-> b[0]-a[0]);
        int[] arr=new int[n-k+1];
        int idx=0;
        for(int i=0;i<n;i++){
            ll.offer(new int[]{nums[i],i});
            int s=i-k+1;
            if(s>=0){
                while(ll.peek()[1]<s){
                    ll.poll();
                }
                arr[idx++]=ll.peek()[0];
            }
        }
        return arr;
    }
}
