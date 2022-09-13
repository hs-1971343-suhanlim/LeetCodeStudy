class Solution {
    public int mySqrt(int x) {
    	if(x == 0 || x == 1)
    		return x;
    	int first = 1;
    	int last = x/2;
    	long mid;
    	int result=0;
    	while(first<=last) {
    		mid = (first+last)/2;
    		if(mid*mid==x)
    			return (int)mid;
    		else if(mid*mid>x) {
    			last=(int)(mid-1);
    		}
    		else {
    			first = (int)(mid+1);
    			result = (int)mid;
    		}
    			
    	}
        return result;
    }
}
public class Sqrt {
	public static void main(String args[]) {
		
	}
}
