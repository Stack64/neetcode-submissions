class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        int n=nums.length;
        int i=0;
        Set<Integer> ss=new HashSet<>();
        for(int j=0;j<n;j++){
            if((j-i)>k){
                ss.remove(nums[i]);
                i++;
            }
            if(ss.contains(nums[j])) 
                return true;
            ss.add(nums[j]);
        }
        return false;
    }
}