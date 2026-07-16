class Solution {
    public String minWindow(String s, String t) {
        if(s.length()<t.length()) return "";
        int[] res={-1,-1};
        int resL=Integer.MAX_VALUE;
        Map<Character,Integer> X2=new HashMap<>();

        for(char c:t.toCharArray()){
            X2.put(c,X2.getOrDefault(c,0)+1);
        }
        for(int i=0;i<s.length();i++){
            Map<Character,Integer> hh=new HashMap<>();
            for(int j=i;j<s.length();j++){
                hh.put(s.charAt(j),hh.getOrDefault(s.charAt(j),0)+1);

                boolean flg=true;
                for(char v:X2.keySet()){
                    if(hh.getOrDefault(v,0) < X2.get(v)){
                        flg=false; break;
                    }
                }

                if(flg && (j-i+1) <resL){
                    resL=j-i+1;
                    res[0]=i;
                    res[1]=j;
                }
            }            
        }

        return resL== Integer.MAX_VALUE ? "" : s.substring(res[0],res[1]+1);
    }
}
