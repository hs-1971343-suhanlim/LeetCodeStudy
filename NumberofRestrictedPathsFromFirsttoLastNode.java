import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

class Solution {
	private boolean found[];
	private int distance[];
	private int sol=0;
	private int choose(int n) {
		int min=Integer.MAX_VALUE;
		int minPos = -1;
		for(int i=0;i<n;i++) {
			if(min>distance[i]&&!found[i]) {
				min = distance[i];
				minPos = i;
			}
		}
		return minPos;
	}
	private void djikstra(int n,int [][]graph) {
		for(int i=0;i<n;i++) {
			distance[i] = graph[n-1][i];
			found[i] = false;
		}
		found[n-1]=true;
		distance[n-1]=0;
		for(int i=0;i<n-1;i++) {
			int u = choose(n);
			found[u]=true;
			for(int k=0;k<n;k++) {
				if(!found[k])
					if(distance[k]>distance[u]+graph[u][k])
						distance[k]=distance[u]+graph[u][k];
			}
		}
	}
	private boolean visited[];

	private void dynamicDfs(int [][]graph,int start, int n) {
		visited[start]=true;
		if(start==n-1) {
			sol++;
			return;
		}
		for(int i=0;i<n;i++) {
			if(!visited[i]&&graph[start][i]!=10000000
					&&(distance[start]>distance[i])) {
				dynamicDfs(graph,i,n);
				visited[i] = false;
			}
		}
	}
    public int countRestrictedPaths(int n, int[][] edges) {
        found = new boolean[n];
        distance = new int[n];
        visited = new boolean[n];
        Arrays.fill(visited, false);
        int graph[][] = new int[n][n];
        // 가중치의 최대 값은 10^5 이어지지 않았다는 표시는 그 것 보다 큰 수로 하면 됨
        for(int i=0;i<n;i++)
        	Arrays.fill(graph[i], 10000000);
        for(int i=0;i<edges.length;i++) {
        	graph[edges[i][0]-1][edges[i][1]-1] = edges[i][2];
        	graph[edges[i][1]-1][edges[i][0]-1] = edges[i][2];
        }
        djikstra(n,graph);
        dynamicDfs(graph,0,n);
        return sol;
    }
}
public class NumberofRestrictedPathsFromFirsttoLastNode {
	public static void main(String args[]) {
		Solution c = new Solution();
		int input[][]= {{1,2,3},{1,3,3},{2,3,1},{1,4,2},{5,2,2},{3,5,1},{5,4,10}};
		c.countRestrictedPaths(5, input);
	}
}
