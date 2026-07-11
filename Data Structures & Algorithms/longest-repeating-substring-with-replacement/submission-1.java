class Solution {
    public int characterReplacement(String s, int k) {
        
        /* 
           Input: s = "XYYX", k = 2
           Output: 4
        */
        int res=0;
        for(int i=0;i<s.length();i++){
            Map<Character,Integer> hh=new HashMap<>();
            int mxf=0;
            for(int j=i;j<s.length();j++){
                hh.put(s.charAt(j),hh.getOrDefault(s.charAt(j),0)+1);
                mxf=Math.max(mxf,hh.get(s.charAt(j)));
                if((j-i+1)-mxf <=k){
                    res=Math.max(res,j-i+1);
                }
            }
        }
        return res;
    }
}
