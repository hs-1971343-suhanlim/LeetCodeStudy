import java.util.Stack;
/*
class Solution {
    boolean found = false;
    public boolean validPath(int n, int[][] edges, int start, int end) {
        if(start == end) return  true;
        
        Map<Integer,List<Integer>> graph = new HashMap();
        boolean[] visited = new boolean[n];
        
        for(int i = 0 ; i < n ; i++) graph.put(i, new ArrayList());
         //construct graph, add bidirectional vertex
        for(int[] edge : edges){
           graph.get(edge[0]).add(edge[1]);
           graph.get(edge[1]).add(edge[0]);
        }
		//start dfs from start point
        dfs(graph,visited,start,end);
        return found;
    }
    
    private void dfs(Map<Integer,List<Integer>> graph,boolean[] visited, int start, int end){
        if(visited[start] || found) return;
        visited[start] = true;
        //when we found and neighbour which is equal to end point inside the recursion, voooleeey! break and return the true
        for(int nei : graph.get(start)){
            if(nei == end){
                found = true;
                break;
            }
            if(!visited[nei])
                dfs(graph, visited, nei, end); //otherwise deep dig again!
        }
    }
}
 */
class Solution {
	private boolean visited[];
	public void setVisited(int [][]edges, int n) {
		visited = new boolean[n];
		for(int i=0;i<n;i++) {
			visited[i]=false;
		}
	}
	public boolean isLinked(int [][]edges, int s, int g) {
		for(int i=0;i<edges.length;i++) {
			if(edges[i][0]==s&&edges[i][1]==g)
				return true;
			else if (edges[i][0]==g&&edges[i][1]==s)
				return true;
		}
		return false;
	}
	public void dfs(int [][]edges, int source, int goal) {
		Stack<Integer> stack = new Stack<Integer>();
		stack.push(source);
		while(!stack.isEmpty()) {
			source = stack.pop();
			visited[source]=true;
			if(source == goal) return;
			for(int i=0;i<visited.length;i++) {
				if(!visited[i]&&isLinked(edges,source,i)) {
					stack.push(i);
				}
			}
		}
		
	}
    public boolean validPath(int n, int[][] edges, int source, int destination) {
    	setVisited(edges, n);
    	if(visited.length<=destination) return false;
    	dfs(edges,source,destination);
    	return visited[destination];
    }
}
public class FindifPathExistsinGraph {
	public static void main(String args[]) {
		Solution sol = new Solution();
		sol.validPath(3, null, 0, 2);
	}
}
