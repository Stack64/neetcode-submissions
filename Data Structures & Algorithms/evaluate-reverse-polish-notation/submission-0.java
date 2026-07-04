class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Long> ss=new Stack<>();
        for(String s:tokens){
            if(s.equals("+")){
                long a=ss.pop();
                long b=ss.pop();
                ss.push(a+b);
            }
            else if(s.equals("-")){
                long a=ss.pop();
                long b=ss.pop();
                ss.push(b-a);
            }
            else if(s.equals("*")){
                long a=ss.pop();
                long b=ss.pop();
                ss.push(a*b);
            }
            else if(s.equals("/")){
               long a=ss.pop();
               long b=ss.pop();
               ss.push(b/a);
            }
            else{
                ss.push(Long.parseLong(s));
            }
        }
        return ss.pop().intValue();
    }
}
