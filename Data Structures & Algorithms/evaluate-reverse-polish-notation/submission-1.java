class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Long> ll=new Stack<>();
        for(String s: tokens){
            if(s.equals("+")){
                long a=ll.pop();
                long b=ll.pop();
                ll.push(a+b);
            }else if(s.equals("-")){
                long a=ll.pop();
                long b=ll.pop();
                ll.push(b-a);
            }else if(s.equals("*")){
                long a=ll.pop();
                long b=ll.pop();
                ll.push(a*b);
            }else if(s.equals("/")){
                long a=ll.pop();
                long b=ll.pop();
                ll.push(b/a);
            }else{
                ll.push(Long.parseLong(s));
            }
        }
        return ll.pop().intValue();
    }
}
