import java.util.Arrays;

class Solution {
	private int sorted[];
	public void merge(int list[],int left,int mid,int right) {
		int i=left;
		int j=mid+1;
		int k=left;
		int l=0;
		while(i<=mid&&j<=right) {
			if(list[i]<=list[j])
				sorted[k++] = list[i++];
			else
				sorted[k++] = list[j++];
		}
		if(i>mid)
			for(l=j;l<=right;l++)
				sorted[k++] = list[l];
		else
			for(l=i;l<=mid;l++)
				sorted[k++] = list[l];
		for(l=left;l<=right;l++)
			list[l] = sorted[l];
	}
	public void mergeSort(int list[],int left,int right) {
		int mid=0;
		if(left<right) {
			mid = (left+right)/2;
			mergeSort(list,left,mid);
			mergeSort(list,mid+1,right);
			merge(list,left,mid,right);
		}
	}
    public int[] smallerNumbersThanCurrent(int[] nums) {
    	sorted = new int [nums.length];
    	// nums Array copy
        int tmp[] = new int [nums.length];
        tmp=Arrays.copyOf(nums,nums.length);
        
        // nums Sort
        mergeSort(nums,0,nums.length-1);
        
        for(int i=0;i<nums.length;i++) {
        	for(int j=0;j<nums.length;j++) {
        		if(tmp[i]==nums[j]) {
        			tmp[i]=j;
        			break;
        		}
        	}
        }

        return tmp;
    }
}
public class HowManyNumbersAreSmallerThantheCurrentNumber {
	public static void main(String args[]) {
		Solution s = new Solution();
		int tmp[] = {8,1,2,2,3};
		s.smallerNumbersThanCurrent(tmp);
	}
}
