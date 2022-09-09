class Solution {
    public int searchInsert(int[] nums, int target) {
    	// 이진 탐색의 시간 복잡도는 O(logN) 
    	// You must write an algorithm with O(log n) runtime complexity.
    	if(nums[0]>target)
    		return 0;
    	int low = 0;
    	int high = nums.length-1;
    	int mid;
    	while(low <= high) {
    		mid = (low+high)/2;
    		if(nums[mid] == target)
    			return mid;
    		else if (nums[mid] > target)
    			high = mid - 1;
    		else
    			low = mid + 1;
    	}
    	return high+1;
    }
}
public class SearchInsertPosition {

	
}
