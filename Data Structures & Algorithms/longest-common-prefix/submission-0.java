class Solution {
    public String longestCommonPrefix(String[] strs) {
        int n=strs.length;
        String pre=strs[0];
        for(int i=1;i<n;i++){
            int j=0;
            while(j< Math.min(strs[i].length(),pre.length())){
                if(pre.charAt(j)!=strs[i].charAt(j)){
                    break;
                }
                j++;
            }
            pre=pre.substring(0,j);
        }
        return pre;
    }
}