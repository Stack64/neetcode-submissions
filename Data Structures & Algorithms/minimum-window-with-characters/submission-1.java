class Solution {
    public String minWindow(String s, String t) {
        Map<Character,Integer> tt=new HashMap<>();
        Map<Character,Integer> ss=new HashMap<>();

        for(char c:t.toCharArray()) tt.put(c,tt.getOrDefault(c,0)+1);
        int resultLength=Integer.MAX_VALUE;
        int[] result={-1,-1};
        int left=0;
        int have=0;
        int need=tt.size();

        for(int r=0;r<s.length();r++){
            char q=s.charAt(r);
            ss.put(q,ss.getOrDefault(q,0)+1);

            if(ss.containsKey(q) && ss.get(q).equals(tt.get(q))){
                have++;
            }

            while(have==need){
              if((r-left+1)< resultLength){
                resultLength=r-left+1;
                result[0]=left;
                result[1]=r;
              }
              char z=s.charAt(left);
              ss.put(z,ss.get(z)-1);
              if(tt.containsKey(z) && ss.get(z) < tt.get(z)){
                 have--;
              }
              left++;}
        }
        return resultLength ==Integer.MAX_VALUE ? "" : s.substring(result[0],result[1]+1);
    }
}
