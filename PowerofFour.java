class Solution {
	/* 해당 방법은 소수일 경우에만 가능
	public int getBigPower(int n) {
		int sol = (int)Math.pow(n, (int)(Math.log(Integer.MAX_VALUE)/Math.log(n)));
		return sol;
	}
    public boolean isPowerOfFour2(int n) {
        return n>0&&getBigPower(4)%n==0;
    }
    */
    // 로그의 수학적 정의 이용 만약 로그n이 로그4로 나누었을때 값이 정수라면 4의 제곱근 
    public boolean isPowerOfFour(int n) {
    	return Math.log(n)/Math.log(4)%1==0;
    }
    public boolean isPowerOfFour2(int n) {
    	if(n<=0) return false;
    	while(n!=1) {
    		if(n%4!=0) return false;
    		n /=4;
    	}
    	return true;
    }
}
public class PowerofFour {

}
