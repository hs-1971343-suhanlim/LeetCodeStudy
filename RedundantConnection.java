class Solution {
	private int parent[];
	int setFind(int cur) {
		if(parent[cur]==-1)
			return cur;
		while(parent[cur]!=-1) cur = parent[cur];
		return cur;
	}
	void setUnion(int a,int b) {
		int root1 = setFind(a);
		int root2 = setFind(b);
		if(root1 != root2)
			parent[root1] = root2;
	}
    public int[] findRedundantConnection(int[][] edges) {
    	int sol[]=new int[2];
        parent = new int[edges.length+1];
        for(int i=0;i<parent.length;i++) parent[i]=-1;
        for(int i=0;i<edges.length;i++) {
        	int uset = setFind(edges[i][0]);
        	int vset = setFind(edges[i][1]);
        	if(uset==vset) {
        		sol[0] = edges[i][0];
        		sol[1] = edges[i][1];
        		break;
        	}
        	setUnion(uset,vset);
        }
        return sol;
    }
}
public class RedundantConnection {

}
