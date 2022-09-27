import java.util.List;
import java.util.ArrayList;

class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> tmp, pre = null;
        for(int i=0;i<rowIndex+1;i++) {
        	tmp = new ArrayList<Integer>();
        	for(int j=0;j<=i;j++) {
        		if(j==0||j==i)
        			tmp.add(1);
        		else
        			tmp.add(pre.get(j-1)+pre.get(j));
        	}
    		pre = tmp;
        }
        return pre;
    }
}
public class PascalTriangleII {

}
