class Solution {
	// power of num -> 1st for, 2st Mathematics, 3st bit, 4st huge Number
	// use Mathematics n= 3^i i = 로그 3의 
	// i = 로그 b의 n/로그 b의 3 이때 i값이 정수라면 3의 제곱수
	public boolean isPoserOfThree2(int n) {
		return (Math.log10(n) / Math.log10(3)) % 1 == 0;
	}
	// use MAX Int range time O(1), space O(1)  
    public boolean isPowerOfThree(int n) {
    	// int maxPow3 = (int) Math.pow(3, (int)(Math.log(Integer.MAX_VALUE) / Math.log(3)));
    	// maxPow3 == 1162261467 true
        return n>0&&1162261467 % n==0;
    }
}
public class PowerofThree {

}
