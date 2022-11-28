import java.util.Arrays;

class Solution {
	private int sorted[];
	private void merge(int list[],int left,int mid,int right) {
		int i=left;
		int j=mid+1;
		int k=left;
		int l=0;
		while(i<=mid&&j<=right) {
			if(list[i]<=list[j])
				sorted[k++]=list[i++];
			else
				sorted[k++]=list[j++];
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
	private void mergeSort(int list[],int left,int right) {
		int mid=0;
		if(left<right) {
			mid = (left+right)/2;
			mergeSort(list,left,mid);
			mergeSort(list,mid+1,right);
			merge(list,left,mid,right);
		}
	}
    public int minMovesToSeat(int[] seats, int[] students) {
    	sorted = new int[seats.length];
    	int sol=0;
    	mergeSort(seats,0,seats.length-1);
    	mergeSort(students,0,seats.length-1);
    	
    	for(int i=0;i<seats.length;i++) {
    		sol += Math.abs(seats[i]-students[i]);
    	}
    	
    	return sol;
    }
}
public class MinimumNumberofMovestoSeatEveryone {

}
