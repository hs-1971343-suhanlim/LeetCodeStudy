/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

// time complex O(log n) 
class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        long start=1;
        long end=n;
        while(start<=n) {
        	int mid = (int)((start+end)/2);
        	if(isBadVersion(mid)&&!isBadVersion(mid-1))
        		return (int)mid;
        	else if (!isBadVersion(mid))
        		start = mid+1;
        	else if(isBadVersion(mid))
        		end = mid-1;
        }
        return 0; // just maching return type
    }
}
public class FirstBadVersion {
	public static void main(String args[]) {
		int array[] = {1,2,3,4,5,6,7,8,9,10};
		int sol=0;
		int target=4;
		int start=0;
		int end=array.length-1;
		while(start<=end) {
			int mid = (end+start)/2;
			if(array[mid]>target)
				end = mid-1;
			else if(array[mid]<target)
				start = mid+1;
			else {
				sol = mid;
				break;
			}
		}
		System.out.println(sol);
	}
}
