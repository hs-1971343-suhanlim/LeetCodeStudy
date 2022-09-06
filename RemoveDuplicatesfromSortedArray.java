class Solution {
    public int removeDuplicates(int[] nums) {
    	int tmpArray[] = new int[nums.length];
    	int j=0;
    	for(int i=0;i<nums.length-1;i++) {
    		if(nums[i]!=nums[i+1]) 
				tmpArray[j++] = nums[i];	
    	}
    	tmpArray[j++]=nums[nums.length-1];
    	for(int i=0;i<nums.length;i++) {
    		nums[i]=tmpArray[i];
    	}
    	return j;
    }
}
public class RemoveDuplicatesfromSortedArray {
	public static void main(String args[]) {
		int arrayInt[] = {1,1,2};
		Solution a = new Solution();
		int n = a.removeDuplicates(arrayInt);
		System.out.println(n);
	}
}
