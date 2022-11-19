import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Stack;


class Solution2 {
    Map<Integer, Integer> f = new HashMap<>();
    int islands = 0;
    
    public int removeStones(int[][] stones) {
        
        for(int i = 0; i < stones.length; ++i) {
            union(stones[i][0], ~stones[i][1]);
        }
        
        return stones.length - islands;
    }
    
    private int find(int x) {
        
        if(f.putIfAbsent(x, x) == null) {
            islands++;
        }
        
        if(x != f.get(x)) {
            f.put(x, find(f.get(x)));
        }
        
        return f.get(x);
    }
    
    private void union(int x, int y) {
        
        x = find(x);
        y = find(y);
        
        if(x != y) {
            f.put(x, y);
            islands--;
        }
    }
} 

class Solution {
	private Set<Integer> visited = new HashSet<Integer>();
	private int sol[];
	private boolean isLinked(HashMap<Integer, List<Integer>> graph, int v1, int v2){
		if(graph.get(v1).contains(v2))
			return true;
		return false;
	}
	public void dfs(HashMap<Integer, List<Integer>> graph, int first) {
		Stack<Integer> stack = new Stack<Integer>();
		stack.add(first);
		visited.add(first);
		sol[first]+=1;
		while(!stack.isEmpty()) {
			int tmp = stack.pop();
			for(int i=0;i<graph.size();i++) {
				if(!visited.contains(i)&&isLinked(graph,tmp,i)) {
					stack.add(i);
					visited.add(i);
					sol[first]+=1;
				}
			}
		}
	}
    public int removeStones(int[][] stones) {
    	int tmp = 0;
    	sol = new int [stones.length];
    	Arrays.fill(sol, -1);
    	HashMap<Integer, List<Integer>> graph = new HashMap<Integer,List<Integer>>();
    	for(int i=0;i<stones.length;i++)
    		graph.put(i, new ArrayList<Integer>());
    	
    	for(int i=0;i<stones.length;i++) {
    		for(int j=0;j<stones.length;j++) {
    			if(stones[i][0]==stones[j][0]||stones[i][1]==stones[j][1])
    	    		graph.get(i).add(j);
    		}
    	}
    	for(int i=0;i<stones.length;i++) {
    		dfs(graph,i);
    		if(sol[i]!=-1)
    			tmp+=sol[i];
    	}
    	return tmp;
    }
}
public class MostStonesRemovedwithSameRoworColumn {
	public static void main(String args[]) {
		Solution2 s = new Solution2();
		int input[][] = {{0,0},{0,1},{1,0},{1,2},{2,1},{2,2}};
		s.removeStones(input);
	}
}
