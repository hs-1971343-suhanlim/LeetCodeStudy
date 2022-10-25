import java.util.Arrays;

class Solution {
	// String.join("사이에 추가될 문자",합칠 String문자들 or 배열); 
	public boolean arrayStringsAreEqualOptimal(String[] word1, String[] word2) {
	        return String.join("",word1).equals(String.join("",word2));
	    }
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        String tmp1=new String("");
        String tmp2=new String(""); 
    	for(int i=0;i<word1.length;i++) {
        	tmp1+=word1[i];
        }
        for(int i=0;i<word2.length;i++) {
        	tmp2+=word2[i];
        }
        char tmp1Array[] = tmp1.toCharArray();
        char tmp2Array[] = tmp2.toCharArray();
        if(tmp1Array.length!=tmp2Array.length) return false;
        for(int i=0;i<tmp1Array.length;i++) {
        	if(tmp1Array[i]!=tmp2Array[i])
        		return false;
        }
        return true;
    }
}
public class CheckIfTwoStringArraysareEquivalent {

}
