import java.util.ArrayList;
import java.util.List;

class Solution2 {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> list = new ArrayList<List<Integer>>();
        List<Integer> res, tmp = null;
        for(int i=0;i<numRows;i++) {
        	res = new ArrayList<Integer>();
        	for(int j=0;j<=i;j++) 
        		if(j==0||j==i)
        			res.add(1);
        		else
        			res.add(tmp.get(j-1)+tmp.get(j));
        		tmp = res;
        		list.add(res);
        	}
        	return list;
        }
    }
    
public class PascalTriangleAlgorithm {
	public static void main(String args[]) {
		
	}
}
