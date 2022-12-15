
class Solution {
	public boolean isPerfectSquareOtimal(int num) {
        long end = 0;
        for(long i = 1; i <= num; i *= 2){
            if(i*i >= num){
                end = i;
                break;
            }
        }
        if(end*end == num) 
            return true;

        long start = 0, mid;
        while(start <= end){
            mid = (end - start) / 2 + start;
            if(mid*mid == num)
                return true;
            else if(mid*mid < num)
                start = mid + 1;
            else end = mid - 1;
        }
        return false;
    }
	private int countDivisors(int n) {
		int count=0;
		for(int i=1;i*i<=n;i++) {
			if(i*i==n)
				count+=1;
			else if(n%i==0)
				count+=2;
		}
		return count;
	}
	public boolean solve(int num) {
        int start=0;
		int end = num;
		while(start<=end){
			int mid = (start+end)/2;
			if(mid*mid>num) {
				end=mid-1;
			}
			else if (mid*mid<num) {
				start = mid+1;
			}
			else
				return true;
		}
		return false;
	}
    public boolean isPerfectSquare(int num) {
        return countDivisors(num)%2==1;
    }
}
public class ValidPerfectSquare {
	public static void main(String args[]) {
		Solution s = new Solution();
		s.solve(16);
		s.isPerfectSquare(16);
	}
}
