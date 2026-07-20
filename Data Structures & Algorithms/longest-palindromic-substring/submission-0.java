class Solution {
    public String longestPalindrome(String s) {
        if(s==null || s.length()==0) return "";
        // ===================================================== 
        // Step 1: Transform the String 
        // Example: 
        // "abba" 
        // becomes 
        // "^#a#b#b#a#$"
        // ===================================================== 

        StringBuilder sb=new StringBuilder("^");
        for(char c:s.toCharArray()){ sb.append("#").append(c);}
        sb.append("#$");
        String t=sb.toString();

        // ===================================================== 
        // Step 2: Create Radius Array 
        // P[i] = Radius of palindrome centered at i 
        // =====================================================
        int n=sb.length();
        int[] p=new int[n];

        // ===================================================== 
        // Step 3: Initialize Center and Right Boundary 
        // =====================================================

        int center=0,right=0;
        int maxCenter=0;
        int maxLen=0;
        // ===================================================== 
        // Step 4: Process Every Character 
        // =====================================================

        for(int i=1;i<n-1;i++){
            // ----------------------------------------- 
            // Find Mirror Position 
            // -----------------------------------------

            int mirror=2*center-i;

            // ----------------------------------------- 
            // If current position lies inside 
            // the current palindrome, 
            // reuse previously computed radius. 
            // -----------------------------------------

            if(i<right){
                p[i]=Math.min(right-i,p[mirror]);
            }

            // ----------------------------------------- 
            // Try expanding beyond current radius 
            // -----------------------------------------

            while(sb.charAt(i+1+p[i])==sb.charAt(i-1-p[i])){
                p[i]++;
            }

            // ----------------------------------------- 
            // Update Center and Right Boundary 
            // ----------------------------------------- 

            if(i+p[i]>right){
                center=i;
                right=i+p[i];
            }

            // ===================================================== 
            // Step 5: Find Maximum Radius 
            // =====================================================

            if(p[i]>maxLen){
                maxCenter=i;
                maxLen=p[i];
            }
        }

        // ===================================================== 
        // Step 5: Find Maximum Radius 
        // =====================================================
        // int maxCenter=0;
        // int maxLen=0;
        // for(int i=1;i<n-1;i++){
        //     if(p[i]>maxLen){
        //         maxCenter=i;
        //         maxLen=p[i];
        //     }
        // }

        // ===================================================== 
        // Step 6: Convert Back to Original String Index 
        // =====================================================

        int start= (maxCenter-maxLen)/2;

        return s.substring(start,start+maxLen);
    } 
}
