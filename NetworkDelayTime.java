import java.util.Arrays;

class Solution {
	private boolean visited[];
	private int distance[];
	private int choose(int distance[],int n,boolean visited[]) {
		int min = Integer.MAX_VALUE;
		int minpos = -1;
		for(int i=0;i<n;i++) {
			if(distance[i]<min&&!visited[i]) {
				min = distance[i];
				minpos = i;
			}
		}
		return minpos;
	}
	private void dijkstra(int graph[][],int start,int n) {
		for(int i=0;i<n;i++) {
			distance[i] = graph[start][i];
			visited[i] = false;
		}
		visited[start] = true;
		distance[start] = 0;
		for(int i=0;i<n-1;i++) {
			int u = choose(distance,n,visited);
			visited[u]=true;
			for(int w=0;w<n;w++) {
				if(!visited[w])
					if(distance[u]+graph[u][w]<distance[w]) {
						distance[w]=distance[u]+graph[u][w];
					}
			}
		}
	}
    public int networkDelayTime(int[][] times, int n, int k) {
        distance = new int[n];
        visited = new boolean[n];
        int sol=0;
        int graph[][] = new int[n][n];
        // 데이터 정제
        for(int i=0;i<n;i++) {
        	Arrays.fill(graph[i], 1000);
        }
        for(int i=0;i<times.length;i++) {
        	graph[times[i][0]-1][times[i][1]-1]=times[i][2];
        }
        // k 부터 다른 모든 정점 까지의 최단 거리 계산 
        dijkstra(graph,k-1,n);
        // 방문 하지 못하는 정점이 있다면 return -1 없다면 가장 긴 거리 값 리턴
        for(int i=0;i<n;i++) {
        	if(distance[i]==1000)
        		return -1;
        	else if(distance[i]>=sol)
        		sol = distance[i];
        }
        return sol;
    }
}
public class NetworkDelayTime {
	public static void main(String args[]) {
		Solution s = new Solution();
		int tmp[][] = {{2,1,1},{2,3,1,},{3,4,1}}; 
		s.networkDelayTime(tmp, 4, 2);
	}
}
