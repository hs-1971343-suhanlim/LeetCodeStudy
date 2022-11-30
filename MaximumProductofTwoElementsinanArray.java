class Solution {
	private int tmp[];
	private void merge(int list[],int left,int mid, int right) {
		int i=left;
		int j=mid+1;
		int k=left;
		while(i<=mid&&j<=right) {
			if(list[i]<=list[j])
				tmp[k++]=list[i++];
			else
				tmp[k++]=list[j++];
		}
		if(i>mid) {
			for(int t=j;t<=right;t++)
				tmp[k++]=list[t];
		}
		else
			for(int t=i;t<=mid;t++)
				tmp[k++]=list[t++];
		for(int t=left;t<=right;t++) {
			list[t] = tmp[t];
		}
	}
	private void mergeSort(int list[],int left,int right) {
		if(left<right) {
			int mid = (left+right)/2;
			mergeSort(list,left,mid);
			mergeSort(list,mid+1,right);
			merge(list,left,mid,right);
		}
		System.out.println("cutLine");
	}
    public int maxProduct(int[] nums) {
        tmp = new int[nums.length];
    	mergeSort(nums,0,nums.length-1);
        return (nums[nums.length-1]-1)*(nums[nums.length-2]-1);
    }
}
public class MaximumProductofTwoElementsinanArray {
	public static void main(String args[]) {
		Solution s = new Solution();
		int tmp[]= {3,4,5,2};
		s.maxProduct(tmp);
	}
}
