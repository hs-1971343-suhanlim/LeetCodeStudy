class Solution {
    public int searchInsert(int[] nums, int target) {
    	//현재 알고리즘의 최악의 경우의 시간 복잡도는 O(n)
    	//You must write an algorithm with O(log n) runtime complexity.
    	int rememberBigNumIndex=0;
    	boolean flag = true;
    	if(nums[0]>target)
    		return 0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==target) {
            	return i;
            }
            if(nums[i]>target&&flag==true) {
            	rememberBigNumIndex = i;
            	flag = false;
            }
        }
        if(rememberBigNumIndex==0)
        	rememberBigNumIndex=nums.length;
        return rememberBigNumIndex;
    }
}