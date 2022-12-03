import java.util.Vector;

/*
class Solution {
    public int[] sortArrayByParity(int[] nums) {
    	Vector<Integer> tmp = new Vector<Integer>();
    	for(int i=0;i<nums.length;i++) {
    		if(nums[i]%2==1)
    			tmp.add(nums[i]);
    		else
    			tmp.add(0, nums[i]);
    	}
    	for(int i=0;i<nums.length;i++) {
    		nums[i]=tmp.get(i);
    	}
    	return nums;
    }
}*/
class Solution {
    public int[] sortArrayByParity(int[] nums) {
    	int left =0;
    	int right = nums.length-1;
    	while(left<right) {
    		if((nums[left]%2)<(nums[right]%2)) {
    			int temp = nums[left];
    			nums[left] = nums[right];
    			nums[right] = temp;
    		}
    		if(nums[left]%2==0) left++;
    		if(nums[right]%2==1) right--;
    	}
    	return nums;
    }
}
public class SortArrayByParity {

}
