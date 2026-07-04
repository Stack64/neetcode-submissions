class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> ss=new HashSet<>();
        int l=0;
        int n=s.length();
        int maxL=0;
        for(int r=0;r<n;r++){
            while(ss.contains(s.charAt(r))){
                ss.remove(s.charAt(l));
                l++;
            }
            ss.add(s.charAt(r));
            maxL=Math.max(maxL, r-l+1);
        }

        return maxL;
    }
}
