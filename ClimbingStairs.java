// 즉 피보나치 수열 구하는 문제;;
/*a1 = 1      a n = a n-2 + a n-1;
a2 = 2
a3 = 3 // 1번째 칸에서 2칸+2번째 칸에서 1칸 
a4 = 5 // 2번째 칸에서 2칸+3번째 칸에서 1칸
a5 = 8 // 3번째 칸에서 2칸+4번째 칸에서 1칸 
a6 = 13
a7 = 21
a8 = 34*/
class Solution {
	private int fibonacci(int n) {
		if(n==0||n==1)
			return n;
		int first=1;
		int second=1;
		int result=0;
		for(int i=2;i<=n;i++) {
			result = first+second;
			second = first;
			first = result;
		}
		return result;
	}
    public int climbStairs(int n) {
        return fibonacci(n);
    }
}

public class ClimbingStairs {

}
