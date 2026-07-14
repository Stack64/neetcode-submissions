class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int[] q1=new int[26];
        int[] q2=new int[26];
        int l=0;
        for(char c:s1.toCharArray()) { q1[c-'a']++;}
        for(int r=0;r<s2.length();r++){
            q2[s2.charAt(r)-'a']++;
            if(r-l+1==s1.length()){
                if(Arrays.equals(q1,q2)){
                    return true;
                }
                q2[s2.charAt(l)-'a']--;
                l++;
            }
        }
        return false;
    }
}

