class Solution {
    public boolean isPowerOfTwo(int n) {
    /* bitCount(n) 은 해당 정수의 이진법에서의 1의 비트 갯수를 알려준다.
     2^n have always only 1 bit 
     public boolean isPowerOfTwo(int n) {
        return n>0 && Integer.bitCount(n) == 1;
    } 
     */
    	return ((n&n-1))==0 && n>0;
    }
}
public class PowerofTwo {

}
