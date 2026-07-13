class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> ss=new HashMap<>();
        for(String s:strs){
            char[] c=s.toCharArray();
            Arrays.sort(c);
            String s1=new String(c);
            ss.putIfAbsent(s1,new ArrayList<>());
            ss.get(s1).add(s);
        }
        return new ArrayList<>(ss.values());
    }
}
