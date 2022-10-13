import java.util.LinkedList;
import java.util.Queue;

class MyStack {
	private Queue<Integer> firQueue;
	private Queue<Integer> secQueue;
    public MyStack() {
    	firQueue = new LinkedList<Integer>();
    	secQueue = new LinkedList<Integer>();
    }
    
    public void push(int x) {
    	// 1번 2번 큐가 비어 있다->1번 큐에 데이터 넣기
        if(firQueue.isEmpty()&&secQueue.isEmpty()) firQueue.add(x);
        // 1번 큐가 비어 있다, 2번 큐가 비어 있지 않다->1번큐에 데이터 넣기->2번 큐에 데이터 모두 1번에 넣기
        else if(firQueue.isEmpty()&&!secQueue.isEmpty()) {
        	firQueue.add(x); 
        	while(!secQueue.isEmpty()) {
        		firQueue.add(secQueue.remove());
        	}
        }
        // 1번 큐가 비어 있지 않다, 2번 큐가 비어 있다->2번 큐에 데이터 넣기->1번큐에 데이터 모두 2번큐에 넣기
        else if(!firQueue.isEmpty()&&secQueue.isEmpty()) {
        	secQueue.add(x);
        	while(!firQueue.isEmpty()) {
        		secQueue.add(firQueue.remove());
        	}
        }
    }
    
    public int pop() {
    	if(firQueue.isEmpty())
    		return secQueue.remove();
    	else
    		return firQueue.remove();
    }
    
    public int top() {
    	if(firQueue.isEmpty())
    		return secQueue.size();
    	else
    		return firQueue.size();
    }
    
    public boolean empty() {
        return firQueue.isEmpty()&&secQueue.isEmpty();
    }
}
/* 큐 한개로 스택을 구현
 class MyStack {
    Queue<Integer> q1 = new LinkedList<>();
    public MyStack() {
        
    }
    public void push(int x) {
        q1.offer(x);
        for(int i = 0; i < q1.size() - 1; i++){
            q1.offer(q1.poll());
        }
    }
    
    public int pop() {
        return q1.poll();
    }
    
    public int top() {
        return q1.peek();
    }
    
    public boolean empty() {
        return q1.isEmpty();
    }
}
 */
/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */
public class ImplementStackusingQueues {

}
