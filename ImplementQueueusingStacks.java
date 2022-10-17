import java.util.Stack;

class MyQueue {
	private Stack<Integer> queue, helper;
    public MyQueue() {
    	queue = new Stack<Integer>();
    	helper = new Stack<Integer>();
    }
    
    public void push(int x) {
    	//queue->helper+1->queue 
        if(queue.isEmpty()&&helper.isEmpty())
        	queue.push(x);
        else {
        	while(!queue.isEmpty()) 
        		helper.push(queue.pop());
        	helper.push(x);
        	while(!helper.isEmpty()) 
        		queue.push(helper.pop());
        }
    }
    
    public int pop() {
        return queue.pop();
    }
    
    public int peek() {
        return queue.peek();
    }
    
    public boolean empty() {
        return queue.isEmpty();
    }
}

public class ImplementQueueusingStacks {

}
