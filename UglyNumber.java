

class Solution {
	// 2, 3, 5 만을 약수로 가져야 한다면 해당 수들로 계속해서 나누어서 1이 되면 참 아니면 거짓 
    public boolean isUgly(int n) {
        if(n<=0) return false;
        for(int i:new int[] {2,3,5}) {
        	while(n%i==0) {
        		n/=i;
        	}
        }
        return n==1;
    }
}
public class UglyNumber {

}
