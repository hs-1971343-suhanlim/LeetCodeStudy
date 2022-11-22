import java.util.Arrays;
/*
class Solution {
    public double maxProbability(int n, int[][] edges, double[] s, int start, int end) {
        //build adjList, g[i] stores {neib of i, weigth}
        List<Pair>[] g = new ArrayList[n];
        for(int i=0; i<n; i++){
            g[i] = new ArrayList<>();
        }
        for(int i = 0; i<edges.length; i++){
            g[edges[i][0]].add(new Pair(edges[i][1], s[i]));
            g[edges[i][1]].add(new Pair(edges[i][0], s[i]));
        }
        
        // init a pq, put {parent node, probability}, bigger probability will be polled out first
        PriorityQueue<Pair> pq = new PriorityQueue<>(new Comparator<Pair>() {  
            public int compare(Pair a, Pair b) {
                if(a.prob < b.prob) return 1;
                else if(a.prob > b.prob) return -1;
                return 0;
            }
        }); 
        //add start node, init probability = 1
        pq.offer(new Pair(start, 1));
        
        Set<Integer> visited = new HashSet<>();
        
        double res = Integer.MIN_VALUE;
        
        while(!pq.isEmpty()){
            Pair cur = pq.poll();
            if(cur.node == end) res = Math.max(res, cur.prob);
            visited.add(cur.node);
            for(Pair next : g[cur.node]){
                if(!visited.contains(next.node)){
                    pq.offer(new Pair(next.node, next.prob * cur.prob));
                }
            }
            
        }
        //if res is MIN, it means we cannot reach the end node     
        return res== Integer.MIN_VALUE? 0 : res;
    }
	
    class Pair{
        int node;
        double prob;
        Pair(int node, double prob){
            this.node = node;
            this.prob = prob;
        }
    }
}
 */
class Solution {
	private double distance[];
	private boolean found[];
	private int choose(int n) {
		double min=-1;
		int minPose=-1;
		for(int i=0;i<n;i++) {
			if(min<distance[i]&&!found[i]) {
				min = distance[i];
				minPose = i;
			}
		}
		return minPose;
	}
	private void djikstra(double [][]graph, int start, int n) {
		for(int i=0;i<n;i++) {
			distance[i] = graph[start][i];
		}
		found[start] = true;
		distance[start] = 1; // 자기 자신을 방문할 확률은 100%
		for(int i=0;i<n-1;i++) {
			int u = choose(n);
			found[u]=true;
			for(int j=0;j<n;j++) {
				if(!found[j])
					if(distance[u]*graph[u][j]>distance[j])
						distance[j] = distance[u]*graph[u][j];
				
			}
		}
	}
    public double maxProbability(int n, int[][] edges, double[] succProb, int start, int end) {
        double [][]graph= new double[n][n];
        distance = new double [n];
        found = new boolean [n];
        Arrays.fill(found,false);
        // 0~1 사이의 값의 가중치를 가지는데 (이어지지 않았다 = 0)
        //이때 최단 거리를 결정할 요소는 두 가중치 사이의 곱이 큰 곳을 고르기 때문에
        for(int i=0;i<n;i++) {
        	Arrays.fill(graph[i], 0);
        }
        // 데이터 입력
        for(int i=0;i<succProb.length;i++) {
        	graph[edges[i][0]][edges[i][1]]=succProb[i];
        	graph[edges[i][1]][edges[i][0]]=succProb[i];
        }
        djikstra(graph, start, n);
        
        return distance[end];
    }
}
public class PathwithMaximumProbability {

}
