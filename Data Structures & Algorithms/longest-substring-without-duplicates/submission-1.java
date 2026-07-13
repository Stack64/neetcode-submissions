class Solution {
    public int lengthOfLongestSubstring(String s) {
        //Sliding Window O(N)
        int res=0;
        int n=s.length();
        int mx=0;
        int l=0;
        HashMap<Character,Integer> hh=new HashMap<>();
        for(int i=0;i<n;i++){
            if(hh.containsKey(s.charAt(i))){
                l=Math.max(l,hh.get(s.charAt(i))+1);
            }
            hh.put(s.charAt(i),i);
            res=Math.max(res,i-l+1);
        }
        return res;
    }
}
