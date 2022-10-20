import java.util.Vector;
class Solution {
	// space Complexity O(n) Time Complexity O(n)
    public void moveZeroes(int[] nums) {
    	Vector<Integer> tmp = new Vector<Integer>();
    	int countNotZero = 0;
    	for(int i=0;i<nums.length;i++) {
    		if(nums[i]!=0) {
    			tmp.add(nums[i]);
    			countNotZero++;
    		}
    	}
    	for(int i=0;i<nums.length-countNotZero;i++)
    		tmp.add(0);
    	for(int i=0;i<nums.length;i++) {
    		if(tmp.size()!=0) {
    		nums[i] = tmp.elementAt(i);
    		}
    	}
    }
    // space Complexity O(1) Time Complexity O(n)
    public void moveZeroes2(int []nums) {
    	int lastNonZeroFoundAt = 0;
    	for(int i=0;i<nums.length;i++) {
    		if(nums[i]!=0)
    			nums[lastNonZeroFoundAt++] = nums[i];
    	}
    	for(int i=lastNonZeroFoundAt;i<nums.length;i++) {
    		nums[i] = 0;
    	}
    }
    // space Complexity O(1) Time Complexity O(n)
    public void moveZeroes3(int []nums) {
    	for (int lastNonZeroFoundAt = 0, cur = 0; cur < nums.length; cur++) {
            if (nums[cur] != 0) {
            	int tmp =nums[lastNonZeroFoundAt++];
            	nums[lastNonZeroFoundAt++]=nums[cur];
                nums[cur]=tmp;
            }
        }
    }
    // brilliant solution
    public void moveZeroes4(int[] nums) {
        // Base case null check and check for 0 or single element input
        if (nums == null || nums.length <= 1) return;

        int leftMostZeroIndex = 0;                      // Tracks the index of the left-most 0 in the array during iteration

        // Iterate through input array of numbers, moving all 0's to the end
        // of the array and maintaining relative order of non-zero elements
        for (int i = 0; i < nums.length; i++)
        {
            // 0's are found to the left of the current non-zero number, swap the 0 and non-zero entry in array
            if (nums[i] != 0 && leftMostZeroIndex++ < i)
            {
                // Swap 0 and non-zero elements
                nums[leftMostZeroIndex - 1] = nums[i];  // Set index of left-most 0 to non-zero entry at curr index
                nums[i] = 0;                            // Set curr index value to 0
            }
        }
    }
}
public class MoveZeroes {

}
