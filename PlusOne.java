
class Solution {
    public int[] plusOne(int[] digits) {
    	boolean isOver = false;
    	int j = digits.length-1;
    	int tmp[]= new int[digits.length+1];
    	while(true) {
    		digits[j]++;
    		if(digits[j]>=10) {
    			digits[j]=0;
    			if(j==0) {
        			for(int i=0;i<digits.length;i++) 
        				tmp[i+1]=digits[i];
        			tmp[0]=1;
        			isOver = true;
        			break;
        		}
    		}
    		else
    			break;
    		j--;		
    	}
    	if(isOver)
    		return tmp;
    	else
    		return digits;        	
    }
}

public class PlusOne {

}
