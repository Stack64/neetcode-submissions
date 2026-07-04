class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashSet<Integer> ss=new HashSet<>();
        for(int n:nums){
            if(ss.contains(n)) return true;
            ss.add(n);
        }
        return false;
    }
}