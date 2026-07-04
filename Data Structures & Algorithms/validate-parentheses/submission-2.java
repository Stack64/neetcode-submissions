class Solution {
    public boolean isValid(String s) {
        Map<Character,Character> mm=new HashMap<>();
        Stack<Character> cc=new Stack<>();
        mm.put(']','['); mm.put('}','{'); mm.put(')','(');

        for(char c:s.toCharArray()){
            if(mm.containsKey(c)){
                if(!cc.isEmpty() && cc.peek()==mm.get(c)){
                    cc.pop();
                }else{
                    return false;
                }
            }else{
                cc.push(c);
            }
        }
        return cc.isEmpty();
    }
}
