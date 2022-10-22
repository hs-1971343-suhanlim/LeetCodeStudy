class Solution {
    // you need to treat n as an unsigned value
    public int hammingWeight(int n) {
        return Integer.bitCount(n);
    }
    public int hammingWeight2(int n) {
    	int count=0;
    	int mask=1;
    	while(n!=0) {
    		if((n&mask)==1)
    			count++;
    		n=n>>>1;
    	}
        return count;
    }
}
public class Numberof1Bits {

}
