class Solution {
	private int tmp[];
	private void merge(int list[],int left,int mid,int right) {
		int i=left;
		int j=mid+1;
		int k=left;
		while(i<=mid&&j<=right) {
			if(list[i]<=list[j])
				tmp[k++] = list[i++];
			else
				tmp[k++] = list[j++];
		}
		if(i>mid) 
			for(int t=j;t<=right;t++)
				tmp[k++] = list[t];
		else
			for(int t=i;t<=mid;t++)
				tmp[k++] = list[t];
		for(int t=left;t<=right;t++)
			list[t]=tmp[t];
		
	}
	private void mergeSort(int list[],int left, int right) {
		int mid=0;
		if(left<right) {
			mid = (left+right)/2;
			mergeSort(list,left,mid);
			mergeSort(list,mid+1,right);
			merge(list,left,mid,right);
		}	
	}
    public int arrayPairSum(int[] nums) {
        int sol=0;
    	tmp = new int [nums.length];
        mergeSort(nums,0,nums.length-1);
        for(int i=nums.length-2;i>=0;i-=2) {
        	sol+=nums[i];
        }
        return sol;
    }
}
public class ArrayPartition {
	public static void main(String args[]) {
		Solution s = new Solution();
		int tmp[] = {1,4,3,2};
		s.arrayPairSum(tmp);
	}
}
