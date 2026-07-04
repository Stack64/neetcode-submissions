class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> ss=new HashMap<>();
        for(String s:strs){
            int[] co=new int[26];
            for(char d : s.toCharArray()){
                co[d-'a']++;
            }
            String mm=Arrays.toString(co);
            ss.putIfAbsent(mm,new ArrayList<>());
            ss.get(mm).add(s);
        }

        return new ArrayList<>(ss.values());
    }
}
