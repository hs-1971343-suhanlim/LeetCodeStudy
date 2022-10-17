import java.util.HashSet;
import java.util.Set;

class Solution {
	/*	
    public boolean checkIfPangram(String sentence) {
        for(int i=0;i<26;i++){
            int c=(char)('a'+i);
            if(sentence.indexOf(c)==-1){
                return false;
            }
        }return true;
    }
	 */
	// Allow duplicates, do not consider the order -> Set
    public boolean checkIfPangram(String sentence) {
    	Set<Character> tmp = new HashSet<Character>();
    	Set<Character> sol = new HashSet<Character>();
    	for(int i='a';i<='z';i++) {
    		sol.add((char)i);
    	}
    	for(int i=0;i<sentence.length();i++) {
    		tmp.add(sentence.charAt(i));
    	}
    	if(tmp.equals(sol)) return true;
    	return false;
    }
}
public class CheckiftheSentenceIsPangram {
	public static void main(String args[]) {

	}
}
