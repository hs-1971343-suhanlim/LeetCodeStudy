import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

class Solution {
	private int visited[];
    public int findJudge(int n, int[][] trust) {
    	if(n==1) return 1;
    	visited = new int [n+1];
    	for(int i=0;i<n;i++) visited[i]=0;
    	HashMap<Integer,List<Integer>> graph = new HashMap<Integer,List<Integer>>();
    	for(int i = 0 ; i < trust.length ; i++) graph.put(trust[i][0], new ArrayList<Integer>());
    	if(n-1!=graph.size())
    		return -1;
    	 for(int[] edge : trust) {
             graph.get(edge[0]).add(edge[1]);
             visited[edge[1]]+=1;
    	 }
    	 for(int i=0;i<=n;i++) { 
    		 if(visited[i]==n-1)
    			 return i;
    	 }
    	 return -1;
    }
}
public class FindtheTownJudge {
	public static void main(String args[]) {
		Solution sol = new Solution();
		int tmp[][]= {{1,2}};
		sol.findJudge(2, tmp);
	}
}
