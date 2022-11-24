import java.util.Arrays;
import java.util.List;
import java.util.Vector;

class Solution {
	public void sort(int []array) {
		int min=1000;
		int minpos=-1;
		int tmp[] = new int[array.length];
		int i=0,j=0;
		for(i=0;i<array.length;i++) {
			for(j=i+1;j<array.length;j++) {
				if(min>array[j])
					minpos = j;
			}
			tmp[i]=array[i];
			array[i] = array[j];
		}
	}
    public List<Integer> targetIndices(int[] nums, int target) {
        List<Integer> sol = new Vector<Integer>();
        sort(nums);
        //Arrays.sort(nums);
        for(int i=0;i<nums.length;i++) {
        	if(target==nums[i])
        		sol.add(i);
        }
        return sol;
    }
}
public class FindTargetIndicesAfterSortingArray {

}
