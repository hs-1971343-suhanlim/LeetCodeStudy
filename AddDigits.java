class Solution {
	// https://leetcode.com/problems/add-digits/discuss/1754397/Clear-step-by-step-explanation-on-getting-the-math
	// 9의 수학적 특징 9로 나누어 떨어진다면 각자리 수의 합은 9가 나온다 
	// %9를 통해 우리는 각 자리 수의 합의 최신 결과를 알 수 있다.
	public int addDigitsOptimal(int num) {
        if(num == 0)
            return 0;
        num %= 9;
        return num == 0 ? 9 : num;
    }
	public int helper(int num) {
		String tmp = new String(Integer.toString(num));
		String array[] = tmp.split("");
		int sol=0;
		for(int i=0;i<array.length;i++) {
			sol+=Integer.parseInt(array[i]);
		}
		return sol;
	}
    public int addDigits(int num) {
        while(num>=10) {
        	num=helper(num);
        }
        return num;
    }
}
public class AddDigits {

}
