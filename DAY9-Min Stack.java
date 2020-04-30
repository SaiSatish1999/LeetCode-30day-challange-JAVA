class MinStack {

    /** initialize your data structure here. */
     Stack<Integer> a;
     Stack<Integer> min;
    public MinStack() {
      a=new  Stack<Integer>(); 
      min= new Stack<Integer>();
      min.push(Integer.MAX_VALUE);
    } 
    public void push(int x) {
        a.push(x);
         if(x<min.peek()){
             min.push(x);
         }else{
             
         min.push(min.peek());
         }
    }
    
    public void pop() {
        a.pop();
        min.pop();
    }
    
    public int top() {
       return  a.peek();
    }
    
    public int getMin() {
        return min.peek();
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(x);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */
