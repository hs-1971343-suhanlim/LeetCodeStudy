import java.util.ArrayList;
import java.util.Arrays;

class Solution {
	private boolean selected[];
	private int distance[];
	private int getMinsVertex(int n) {
		int v=0;
		for(int i=0;i<n;i++)
			if(!selected[i]) {
				v = i;
				break;
			}
		for(int i=0;i<n;i++) {
			if(!selected[i]&&(distance[i]<distance[v])) v = i;
		}
		return v;
	}
	private int prime(int [][]weigth) {
		int tmp; int sol=0;
		for(int u=0;u<weigth.length;u++) {
			distance[u] = Integer.MAX_VALUE;
			selected[u] = false;
		}
		distance[0] = 0; // 시작정점 0
		for(int i=0;i<weigth.length;i++) {
			tmp = getMinsVertex(weigth.length);
			selected[tmp] = true;
			if(distance[tmp] == Integer.MAX_VALUE) return sol;
			sol+=distance[tmp];
			for(int v=0;v<weigth.length;v++) {
				if(weigth[tmp][v] != Integer.MAX_VALUE)
					if(!selected[v]&&weigth[tmp][v]<distance[v])
						distance[v] = weigth[tmp][v];
			}
		}
		return sol;
	}
	private int getDistance(int x1,int y1,int x2,int y2) {
		int xtmp = (int)Math.abs(x2-x1); 
		int ytmp = (int)Math.abs(y2-y1);
		int tmp = xtmp+ytmp;
		return tmp;
 	}
    public int minCostConnectPoints(int[][] points) {
    	if(points.length==1) return 0;
    	// 가중치 배열 만들기
    	selected = new boolean[points.length];
    	distance = new int [points.length];
    	int weigth[][]= new int [points.length][];
    	for(int i=0;i<points.length;i++) {
    		weigth[i] = new int [points.length];
    		Arrays.fill(weigth[i], Integer.MAX_VALUE);
    	}
    	
    	for(int i=0;i<points.length;i++) {
    		for(int j=i+1;j<points.length;j++) {
    			int wei = getDistance(points[i][0],points[i][1],points[j][0],points[j][1]);
    			weigth[i][j] = wei;
    			weigth[j][i] = wei;
    		}
    	}
    	
        return prime(weigth);
    }
}
public class MinCosttoConnectAllPoints{
	public static void main(String args[]) {
		Solution s = new Solution();
		//				 0		1	  2		3	4
		int tmp[][] = {{0,0},{2,2},{3,10},{5,2},{7,0}};
		s.minCostConnectPoints(tmp);
	}
}
