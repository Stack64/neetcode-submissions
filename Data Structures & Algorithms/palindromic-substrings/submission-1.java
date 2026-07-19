class Solution {
    public int countSubstrings(String s) {
        int res=0;
        for(int i=0;i<s.length();i++){
            res+=expand(s,i,i);
            res+=expand(s,i,i+1);
        }
        return res;
    }
    public int expand(String s,int i,int j){
        int l=i,r=j, count=0;
        while(l>=0 && r<s.length() && s.charAt(l)==s.charAt(r)){
            l--;
            r++;
            count++;
        }
        return count;
    }
}
