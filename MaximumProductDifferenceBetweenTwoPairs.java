class Solution {
	private int tmp[];
	private void merge(int list[],int left,int mid,int right) {
		int i=left;
		int j=mid+1;
		int k=left;
		int l=0;
		while(i<=mid&&j<=right) {
			if(list[i]<=list[j])
				tmp[k++] = list[i++];
			else
				tmp[k++] = list[j++];
		}
		if(j>right) {
			for(l=i;l<=mid;l++)
				tmp[k++]=list[l];
		}
		else {
			for(l=j;l<=right;l++)
				tmp[k++]=list[l];
		}
		for(l=left;l<=right;l++)
			list[l] = tmp[l];
	}
	private void mergeSort(int list[],int left,int right) {
		int mid=0;
		if(left<right) {
			mid = (left+right)/2;
			mergeSort(list,left,mid);
			mergeSort(list,mid+1,right);
			merge(list,left,mid,right);
		}
	}
    public int maxProductDifference(int[] nums) {
    	tmp = new int[nums.length];
        mergeSort(nums,0,nums.length-1);
        return (nums[nums.length-2]*nums[nums.length-1])-(nums[0]*nums[1]);
    }
}
public class MaximumProductDifferenceBetweenTwoPairs {

}
