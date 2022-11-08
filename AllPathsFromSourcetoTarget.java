import java.util.List;
import java.util.Stack;
import java.util.LinkedList;

class Solution {
	private List<List<Integer>> sol = new LinkedList<List<Integer>>();
	
	private Stack<Integer> stack = new Stack<Integer>();
	private boolean visited[];
	private	void setVisited(int [][]graph) {
		visited=new boolean[graph.length];
		for(int i=0;i<graph.length;i++) {
			visited[i] = false;
		}
	}
	public boolean isLinked(int [][]graph,int s, int n) {
		for(int i=0;i<graph[s].length;i++) {
			if(graph[s][i]==n)
				return true;
		}
		return false;
	}
	private void bfs(int[][] graph, int start, int goal) {
		visited[start] = true;
		stack.push(start);
		if(start==goal) {
			List<Integer> tmp = new LinkedList<Integer>();
			tmp.addAll(stack);
			sol.add(tmp);
			stack.pop();
			return;
		}
		for(int i=0;i<graph.length;i++) {
			if(!visited[i]&&isLinked(graph,start,i)) {
				bfs(graph,i,goal);
				visited[i]=false;
			}
		}
		stack.pop();
	}
    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
    	setVisited(graph);
    	bfs(graph,0,graph.length-1);
    	return sol;
    }
}
public class AllPathsFromSourcetoTarget {
	public static void main(String args[]) {
		Solution s = new Solution();
		//[[1,2],[3],[3],[]]
		int graph[][] = {{1,2},{3},{3},{0}};
		s.allPathsSourceTarget(graph);
	}
}
