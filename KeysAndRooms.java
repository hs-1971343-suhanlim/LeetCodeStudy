import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.Stack;

class Solution {
	private boolean isCheck[];
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
    	int next=0;
        isCheck = new boolean[rooms.size()];
        for(int i=0;i<isCheck.length;i++) isCheck[i] = false;
        Stack<Integer> stack = new Stack<Integer>();
        stack.add(0);
        while(!stack.isEmpty()) {
        	next = stack.pop();
        	isCheck[next] = true; 
        	for(int i=0;i<rooms.get(next).size();i++) {
        		int key = rooms.get(next).get(i);
        		if(!isCheck[key]) {
        			stack.add(key);
        			isCheck[key]=true;
        		}
        	}
        }
        for(int i=0;i<isCheck.length;i++) 
        	if(!isCheck[i]) return false;
        return true;
    }
}
public class KeysAndRooms {

}
