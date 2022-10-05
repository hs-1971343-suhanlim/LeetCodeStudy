
class Solution {
	public int convertStringToInt(String a, int n) {
		int tmp = ((int)a.charAt(0))-64;
		tmp *= Math.pow(26, n-1);
		return tmp;
	}
    public int titleToNumber(String columnTitle) {
    	int sum=0;
    	String array[] = columnTitle.split("");
    	for(int i=0;i<array.length;i++) {
    		sum+=convertStringToInt(array[i],array.length-i);
    	}
        return sum;
    }
}
public class ExcelSheetColumnNumber {
	public static void main(String args[]) {
		Solution a = new Solution();
		String ins = "AB";
		System.out.println(a.titleToNumber(ins));
	}
}
