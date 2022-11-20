import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.Stack;
import java.util.Vector;

class Solution {
	public int makeConnected2(int n, int[][] connections) {
	    
		/* Count of Nodes -> N */
	    int N = n;  
		
		/* Count of Edges -> E */
	    int E = connections.length; 
		
	    int R = 0;
	    int C = 0;
	    
	    if(E<N-1)
	        return -1;
	    
		/* Create Adjaceny List */
	    List<List<Integer>> adj = new ArrayList<>();
	    
	      for(int i = 0; i<n; i++)
	         adj.add(new ArrayList<>());
	    
	      for(int[] c : connections){
	            adj.get(c[0]).add(c[1]);
	            adj.get(c[1]).add(c[0]);
	        }
	    
	    boolean[] visited = new boolean[n];
	    
		/* Perform DFS traversal to count components -> C */
	    for(int i = 0; i<n; i++){
	        if(!visited[i]){
	            dfs(adj,visited,i);
	            C++;
	        }
	    }
	    
		/* Calculate Redundant Edges -> R */
	    R = E-((N-1)-(C-1));

	    if(R<C-1)
	        return -1;
	    
	    return C-1;
	}

	/* DFS Traversal */
	public void dfs(List<List<Integer>> adj, boolean[] visited, int i){
	    
	    if(visited[i])
	        return;
	    
	    visited[i] = true;
	    
	    List<Integer> connection = adj.get(i);
	    for(int c : connection){
	        if(!visited[c])
	            dfs(adj,visited,c);
	    }
	    return;
	}
	private Set<Integer> visited = new HashSet<Integer>();
	private boolean isLinked(int[][] connections, int s, int e) {
		for(int i=0;i<connections.length;i++) {
			if(connections[i][0]==s&&connections[i][1]==e)
				return true;
			if(connections[i][0]==e&&connections[i][1]==s)
				return true;
		}
		return false;
	}
	private void dfs(int n, int[][] connections, int s) {
		Stack<Integer> stack = new Stack<Integer>();
		stack.add(s);
		visited.add(s);
		while(!stack.isEmpty()) {
			int u = stack.pop();
			for(int i=0;i<n;i++) {
				if(!visited.contains(i)&&isLinked(connections,u,i)) {
					stack.add(i);
					visited.add(i);
				}
			}
		}
	}
    public int makeConnected(int n, int[][] connections) {
        int e = connections.length;
        int c=0;
        int r=0;
    	if(connections.length<n-1)
        	return -1;
    	for(int i=0;i<n;i++) {
    		if(!visited.contains(i)) {
    			dfs(n,connections,i);
    			c++;
    		}
    	}
        r = e-((n-1)-(c-1));
        if(r<c-1)
        	return -1;

        return c-1;
    }
}

public class NumberofOperationstoMakeNetworkConnected {

}
