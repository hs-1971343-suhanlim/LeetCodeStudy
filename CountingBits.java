class Solution {
	public int getCount(int n) {
		int count=0;
		while(n!=0) {
			count++;
			n=n&(n-1);
		}
		return count;
	}
	// time complex O(n)
    public int[] countBits(int n) {
        int sol[] = new int [n+1];
        for(int i=0;i<=n;i++) {
        	sol[i] = Integer.bitCount(i); 
        }
        return sol;
    }
}
public class CountingBits {

}
