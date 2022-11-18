import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

class Solution {
    public int removeStones(int[][] stones) {
    	HashMap<Integer, List<Integer>> graph = new HashMap<Integer,List<Integer>>();
    	if(stones.length==1) return 0;
    	int sol=-1; boolean flag = true;
    	for(int count=0;count<stones.length;count++) {
    		for(int i=0;i<stones.length;i++) {
        			if((stones[count][0]==stones[i][0]&&(count!=i))
        					||(stones[count][1]==stones[i][1]&&(count!=i))) {
        				sol++; flag=false; break; 
        			}
        		
        	}
    	}
        if(sol==-1&&flag)
    	return sol;
    }
}
public class MostStonesRemovedwithSameRoworColumn {

}
