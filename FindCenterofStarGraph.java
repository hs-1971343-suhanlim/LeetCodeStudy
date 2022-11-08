import java.util.HashSet;
import java.util.Set;

class Solution {
	// Set = overlap(중복)허용x 순서x 
	// 별모양 그래프에서 n-1개의 간선을 가지고 있다 -> 중심은 모든 노드와 하나씩 연결되어 있다. 
	// add()는 입력하려는 값이 중복이라면 false 중복이 아니라면 true를 리턴한다.
    public int findCenter(int[][] edges) {
    	Set<Integer> sol = new HashSet<Integer>();
    	for(int i=0;i<edges.length;i++) {
    		if(!sol.add(edges[i][0]))
    			return edges[i][0];
    		else if(!sol.add(edges[i][1]))
    			return edges[i][1];
    	}
    	return 0;
    }
}
public class FindCenterofStarGraph {

}
