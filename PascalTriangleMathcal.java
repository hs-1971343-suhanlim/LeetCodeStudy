import java.util.List;
import java.util.LinkedList;

class Solution {
   // n line (번째 줄) r num (번째 자리) 
	public int pascalUnit(int n, int r) {
      long divisor=1;
      long dividenent=1;
      for(int i=0;i<(r-1);i++) {
         divisor*=(n-1-i);
         dividenent*=(r-1-i);
      }
      return (int)(divisor/dividenent);
   }
   
    public List<List<Integer>> generate(int numRows) {
       List<List<Integer>> list = new LinkedList<List<Integer>>();
       for(int i=0;i<numRows;i++) {
    	    list.add(new LinkedList<Integer>());
    	    for(int j=0;j<i+1;j++) {
    	    	list.get(i).add(pascalUnit(i+1,j+1));
    	    }
       }
       return list;
    }
}
public class PascalTriangleMathcal {
	public static void main(String args[]) {
	      Solution a = new Solution();
	      int b = a.pascalUnit(7, 3);
	      System.out.println(b);
	   }
}
