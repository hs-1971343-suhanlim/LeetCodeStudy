class Solution {
    public boolean isPalindrome(int x) {
        int tmp=x;
        int reverseInt=0;
        if(x>0){
            while(tmp>=0){
                reverseInt *=10;
                reverseInt += tmp%10;
                tmp /=10;
            }
            if(reverseInt == x)
                return true;
            else
                return false;
        }
        else 
            return false;
    }
}
public class PalindromeNumber {
	public static void main(String args[]) {
		Solution a = new Solution();
		boolean result = a.isPalindrome(321);
		System.out.println(result);
	}
}
