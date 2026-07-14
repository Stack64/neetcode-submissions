class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if(s1.length()>s2.length()) return false;
        int[] q1=new int[26];
        int[] q2=new int[26];
        int l=0;
        int matched=0;
        for(int i=0;i<s1.length();i++) { q1[s1.charAt(i)-'a']++; q2[s2.charAt(i)-'a']++;}
        for(int i=0;i<26;i++){
            if(q1[i]==q2[i]){ matched++;}
        }
        for(int r=s1.length();r<s2.length();r++){
            if(matched==26) return true;

            //Add new element;
            int ix=s2.charAt(r)-'a';
            q2[ix]++;
            if(q2[ix]==q1[ix]){
                matched++;
            }else if(q2[ix]==q1[ix]+1){
                matched--;
            }

            //remove first element;
            int iy=s2.charAt(l)-'a';
            q2[iy]--;
            if(q2[iy]==q1[iy]){
                matched++;
            }else if(q2[iy]==q1[iy]-1){
                matched--;
            }
            l++;
        }
        return matched==26;
    }
}

