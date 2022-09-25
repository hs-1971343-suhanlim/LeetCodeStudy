class Solution {
    public int singleNumber(int[] nums) {
// Remember this: a^b = b^c . a^(b^c) = (a^b)^c . a^a = 0. a^0 = a.
    	// for-each 
    	 int num=0;
    	 for(int i : nums) {
    		 num ^=i;
    	 }
          return num;
      }
}
public class SingleNumber {

}
