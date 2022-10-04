/*
class Solution {
    public String convertToTitle(int columnNumber) {
    StringBuilder sb = new StringBuilder();
 while(columnNumber>0)
  {   columnNumber--;
            sb.append((char)(65+columnNumber%26));
            columnNumber /=26;
        } 
        sb= sb.reverse();
        
        return sb.toString();
    }
}
*/
class Solution {
	private StringBuffer solve = new StringBuffer("");
	public char convert(int n) {
		return (char)(n+64);
		
	}
	public int atLestRemain(int n) {
		int sum=0;
		for(int i=0;i<n;i++)
			sum+=Math.pow(26, i);
		return sum;
	}
	public void run(int n) {
		long d = 26;
		int dInt;
		int count = 0;
		if(n<=d) {
			solve.append(convert(n));
			return;
		}
		while(n/d!=0) {
			count++; d*=26;
		} d /=26;
		int sum = atLestRemain(count);
		if((n-sum)/d==0) d/=26;
		dInt = (int)d;
		if(n%dInt==0) {
			solve.append(convert((n-26)/dInt));
			run(26);
		}
		else {
			solve.append(convert(n/dInt));
			run(n%dInt);
		}
	}
    public String convertToTitle(int columnNumber) {
    	run(columnNumber);
    	return solve.toString();
    }
}
public class ExcelSheetColumnTitle {
	public static void main(String args[]) {
		Solution a = new Solution();
		System.out.println(a.convertToTitle(702));
	}
}
