class Solution {
	// XOR(^) -> 0011^1110 -> 1101 differ->1 same->0  
    public int hammingDistance(int x, int y) {
    	int tmp = x^y;
    	return Integer.bitCount(tmp);
    }
}
public class HammingDistance {

}
