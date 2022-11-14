import java.util.HashSet;
import java.util.Set;
import java.util.Stack;

class Solution {
	private Set<Integer> visited = new HashSet<Integer>();
	private void dfs(int isConected[][],int start) {
		Stack<Integer>stack = new Stack<Integer>();
		visited.add(start);
		stack.add(start);
		while(!stack.isEmpty()) {
			int vertex = stack.pop();
			for(int i=0;i<isConected.length;i++) {
				if(!visited.contains(i)&&isConected[vertex][i]==1) {
					stack.add(i);
					visited.add(i);
				}
			}
		}
	}
    public int findCircleNum(int[][] isConnected) {
    	int sol = 0;
    	for(int i=0;i<isConnected.length;i++) {
    		if(!visited.contains(i)) {
    			dfs(isConnected,i);
    			sol+=1;
    		}
    	}
    	return sol;
    }
}
public class NumberofProvinces {
	public static void main(String args[]) {
		Solution s = new Solution();
		int tmp[][] = {{1,1,0},{1,1,0},{0,0,1}};
		s.findCircleNum(tmp);
	}
}
