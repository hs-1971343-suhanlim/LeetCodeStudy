import java.util.Vector;

class Solution {
	// insertion_sort
	private void vectorSort(Vector<Integer>v) {
		int key;
		int j;
		for(int i=1;i<v.size();i++) {
			key = v.get(i);
			for(j=i-1;j>=0&&v.get(j)>key;j--)
				v.set(j+1, v.get(j));
			v.set(j+1, key);
		}
	}
    public int minimumSum(int num) {
        Vector<Integer> list = new Vector<Integer>();
        int a=0,b=0;
        // 0 is drop
        while(num>0) {
        	if(num%10!=0)
        		list.add(num%10);
        	num/=10;
        }
        vectorSort(list);
        // make a,b small num each turn
        for(int i=0;i<list.size();i++) {
        	if(i%2==0) {
        		a*=10;
        		a+=list.get(i);
        	}
        	else {
        		b*=10;
        		b+=list.get(i);
        	}
        }
        return a+b;
    }
}
public class MinimumSumofFourDigitNumberAfterSplittingDigits {

}
