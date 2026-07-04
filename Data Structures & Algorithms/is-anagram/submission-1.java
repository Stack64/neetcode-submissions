class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()) return false;
        int[] d=new int[26];
        for (int i=0;i<s.length();i++){
            d[s.charAt(i)-'a']++;
            d[t.charAt(i)-'a']--;
        }

        for(int i=0;i<26;i++){
            if(d[i]!=0){
                return false;
            }
        }
        return true;
    }
}
