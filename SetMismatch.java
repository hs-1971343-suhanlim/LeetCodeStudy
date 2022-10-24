import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.Iterator;

class Solution {
    public int[] findErrorNums(int[] nums) {
    	Set<Integer> set = new HashSet<Integer>();
    	int sol[] = new int[2];
    	int i=0,j=1,find=0;
    	Arrays.sort(nums);
    	for(i=0;i<nums.length;i++) {
    		if(!set.add(nums[i]))
    			find=i;
    	}
    	sol[0]= nums[find];
    	Iterator<Integer> it = set.iterator();
    	while(it.hasNext()) {
    		if(j!=it.next())
    			break;
    		j++;
    	}
    	sol[1]=j;
    	return sol;
    }
}
public class SetMismatch {
	public static void main (String args[]) {
		Solution a = new Solution();
		int b[] = {1,1};
		a.findErrorNums(b);
	}
}
