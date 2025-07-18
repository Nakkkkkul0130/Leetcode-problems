class MyQueue {
    Stack<Integer> input;
    Stack<Integer> output;

    public MyQueue() {
        input = new Stack<>();
        output = new Stack<>();       
    }
    
    public void push(int x) {
        input.push(x);
    }
    
    public int pop() {
        peek();     // Making sure output has the correct elements
        return output.pop();   
    }
    
    public int peek() {
        if(output.isEmpty()){
            while(!input.isEmpty()){
            output.push(input.pop());
            }
        }
        return output.peek();       
    }
    
    public boolean empty() {
        if(output.isEmpty() && input.isEmpty()){
            return true;
        }
        return false;
        
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */