class MyQueue {

    public Stack<Integer> stack1;
    public Stack<Integer> stack2;

    public MyQueue() {
        stack1 = new Stack<Integer>();
        stack2 = new Stack<Integer>();
    }
    
    public void push(int x) {
       stack1.push(x); 
    }
    
    public int pop() {
       if(stack2.isEmpty()) {
           pushTo2();
       } 
       return stack2.pop();
    }
    
    public int peek() {
       if(stack2.isEmpty()) {
           pushTo2();
       } 
       return stack2.peek();
    }
    
    public boolean empty() {
        return stack1.isEmpty() && stack2.isEmpty();
    }
    public void pushTo2() {
        while(!stack1.isEmpty()) {
            int newEntry = stack1.pop();
            stack2.push(newEntry);
        }
    }
}

