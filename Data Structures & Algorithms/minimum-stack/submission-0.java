class MinStack {

    Stack<Integer> ss;
    public MinStack() {
        ss=new Stack<>();
    }
    
    public void push(int val) {
        ss.push(val);
    }
    
    public void pop() {
        ss.pop();
    }
    
    public int top() {
        return ss.peek();
    }
    
    public int getMin() {
        Stack<Integer> d=new Stack();
        int mx=ss.peek();

        while(!ss.isEmpty()){
            mx=Math.min(mx,ss.peek().intValue());
            d.push(ss.pop());
        }
        while(!d.isEmpty()){
            ss.push(d.pop());
        }

        return mx;
    }
}
