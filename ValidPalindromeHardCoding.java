class Solution {
    public boolean isPalindrome(String s) {
    	if(s.equals("")) return true;
    	String array[]= s.split("");
    	String tmp = new String("");
    	for(int i=0;i<s.length();i++) {
    		if(((array[i].charAt(0)>='A')&&(array[i].charAt(0)<='Z'))||
    			((array[i].charAt(0)>='a')&&(array[i].charAt(0)<='z'))||
    			((array[i].charAt(0)>='0')&&(array[i].charAt(0)<='9')))
    			tmp+=array[i];
    	}
    	tmp = tmp.toLowerCase(); // 소문자로 변경한 스트링 리턴
    	StringBuffer tmp2 = new StringBuffer(tmp);
    	tmp2.reverse();
    	if(tmp2.toString().equals(tmp))
    		return true;
    	else
    		return false;
    }
}
public class ValidPalindromeHardCoding {
	public static void main(String args[]) {
		Solution a = new Solution();
		boolean sol = a.isPalindrome("A man, a plan, a canal: Panama");
		System.out.println(sol);
	}
}
