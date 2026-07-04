class Solution {
    public int characterReplacement(String s, int k) {
        int[] freqq=new int[26];
        int q=s.length();
        int l=0;
        int maxL=0;
        int ans=0;

        for(int i=0;i<q;i++){
            freqq[s.charAt(i)-'A']++;
            maxL = Math.max(maxL, freqq[s.charAt(i)-'A']);

            while((i-l+1)-maxL>k){
                freqq[s.charAt(l)-'A']--;
                l++;
            }

            ans= Math.max(ans,i-l+1);
        }
        return ans;
    }
}
